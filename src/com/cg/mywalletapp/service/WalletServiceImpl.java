package com.cg.mywalletapp.service;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.mywalletapp.beans.Customer;
import com.cg.mywalletapp.beans.Transactions;
import com.cg.mywalletapp.beans.Wallet;
import com.cg.mywalletapp.exception.InsufficientBalanceException;
import com.cg.mywalletapp.exception.InvalidInputException;
import com.cg.mywalletapp.repo.WalletRepo;
import com.cg.mywalletapp.repo.TransactionRepo;
@Service("ser")
@Component(value="ser")
public class WalletServiceImpl implements WalletService{
	
	@Autowired
	private WalletRepo repo;
	@Autowired
	private TransactionRepo repot;

	Transactions trns;
	
	public WalletServiceImpl() {
		super();
	}

	public WalletServiceImpl(WalletRepo repo) {
		super();
		this.repo = repo;
	}



	public Customer createAccount(Customer customer) {
		
		

		return repo.save(customer);
		}
	
	 
	public Customer showBalance(String mobileNo)  {
		Customer customer=repo.findOne(mobileNo);
		
			return customer;	
	}
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) throws InvalidInputException, InsufficientBalanceException {

		Customer cust1=repo.findOne(sourceMobileNo);
		Customer cust2=repo.findOne(targetMobileNo);
		if(cust1!=null)
		{
			if(cust2!=null)
			{
				BigDecimal bal1 = cust1.getWallet().getBalance();
				BigDecimal bal2 = cust2.getWallet().getBalance();
				if(bal1.compareTo(amount)>=0)
				{
					bal1 = bal1.subtract(amount);
				cust1.setWallet(new Wallet(bal1));
				repo.save(cust1);
					bal2=bal2.add(amount);
				cust2.setWallet(new Wallet(bal2));
				repo.save(cust2);				
//				String trans1=new java.util.Date() + "  your account  " + sourceMobileNo +"  is debited with " + amount + "  towards transfer with  "+ targetMobileNo +"  Balance is : "+bal1;
//				trns.setMobileNo(sourceMobileNo);
//				trns.setStatements(trans1);
//				repot.save(trns);
//				String trans2=new java.util.Date() + "  your account  " + targetMobileNo +"  is deposited with " + amount + "  towards transfer from  "+ sourceMobileNo +"  Balance is : "+bal2;
//				trns.setMobileNo(targetMobileNo);
//				trns.setStatements(trans2);
//				repot.save(trns);
				
				}
				else
				{
					throw new InsufficientBalanceException("insufficient balance");					
				}
			}
			else
			{
				throw new InvalidInputException("Destination mobile number not found");
			}
		}else
		{
			throw new InvalidInputException("Source mobile number not found");
		}
		
		
		return cust1;
	}

	public Customer depositAmount(String mobileNo, BigDecimal amount) throws InvalidInputException {

		Customer cust=repo.findOne(mobileNo);
			BigDecimal bal = cust.getWallet().getBalance().add(amount);
			
			cust.setWallet(new Wallet(bal));
			repo.save(cust);
//			String trans=new java.util.Date() + "  your account  "+ mobileNo +"  is deposited with  " + amount +"  your Balance is : "+cust.getWallet().getBalance();
//			trns.setMobileNo(mobileNo);
//			trns.setStatements(trans);
//			repot.save(trns);		
			
		return cust;	
	}

	public Customer withdrawAmount(String mobileNo, BigDecimal amount) throws InvalidInputException, InsufficientBalanceException {
		if(amount==null)
			throw new InvalidInputException("Amount cannot be null");
		
		if(mobileNo==null)
			throw new InvalidInputException("SourceMobile mobile number cannot be null");

		Customer cust=repo.findOne(mobileNo);
		if(cust.getMobileNo()==null)
			throw new InvalidInputException("Mobile number not found");
		BigDecimal bal = cust.getWallet().getBalance();
	if(bal.compareTo(amount)>=0)
	{
		bal = bal.subtract(amount);
	cust.setWallet(new Wallet(bal));
	repo.save(cust);
//	String trans=new java.util.Date() + "  your account  "+ mobileNo +"  is withdrawed with  " + amount +"  your Balance is : "+cust.getWallet().getBalance();
//	trns.setMobileNo(mobileNo);
//	trns.setStatements(trans);
//	repot.save(trns);
	}
	else
	{
		throw new InsufficientBalanceException("Insufficient balance");		
	}
	return cust;
}
	@Override
	public List<String> getTransaction(String mob) {
		return (List<String>) repot.findTranscations(mob);
	}
}