package com.cg.mywalletapp.service;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.mywalletapp.beans.Customer;
import com.cg.mywalletapp.beans.Transactions;
import com.cg.mywalletapp.exception.InsufficientBalanceException;
import com.cg.mywalletapp.exception.WalletAlreadyExistsException;
import com.cg.mywalletapp.exception.WalletNotFoundException;
import com.cg.mywalletapp.exception.WalletServicesDownException;
import com.cg.mywalletapp.repo.WalletRepo;
import com.cg.mywalletapp.repo.TransactionRepo;

@Component(value="service")
public class WalletServiceImpl implements WalletService{
	
	@Autowired
	private WalletRepo repo;
	@Autowired
	private TransactionRepo repot;

	public Customer createAccount(Customer customer) throws WalletServicesDownException, WalletAlreadyExistsException {
		
		Customer c =repo.findOne(customer.getMobileNo());
		if(c!=null)
		{
			throw new WalletAlreadyExistsException("Wallet linked to the Entered Mobile Number ALREADY EXISTS: Please try again."); 
		}
		else
		{
			Transactions t1 = new Transactions(customer.getMobileNo(),
					new java.util.Date() + "\tWallet Created. Balance in Wallet : " + customer.getWallet().getBalance());
			Transactions t2 = repot.save(t1);
			Customer d = repo.save(customer);
			if(d==customer && t2==t1)
			{
				return d;
			}
			else
			{
				throw new WalletServicesDownException(" Registration UNSUCCESSFUL!! Please Try at a later time. Thank you.");
			}
		}
	}
	
	public Customer showBalance(String mobileNo) throws WalletNotFoundException  {
			Customer customer=repo.findOne(mobileNo);
			String log = new java.util.Date() + "\tViewed Balance.";
			Transactions t1 = new Transactions(mobileNo, log);
			Transactions t2 = repot.save(t1);
			if(customer!=null && t2==t1)
			{				
				return customer;
			}
			else
			{
				throw new WalletNotFoundException(" Wallet with Entered Mobile Number Does NOT EXIST: Please try again. ");
			}
	}
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) throws WalletNotFoundException, InsufficientBalanceException, WalletServicesDownException {

		
		if(repo.findOne(sourceMobileNo)!=null)
		{
			if(repo.findOne(targetMobileNo)!=null)
			{
				Customer bx = repo.findOne(sourceMobileNo);
				Customer cx = repo.findOne(targetMobileNo);

				BigDecimal b = bx.getWallet().getBalance();
				BigDecimal c = cx.getWallet().getBalance();

				int i = b.compareTo(amount);

				if (i >= 0) {
					b = b.subtract(amount);
					bx.getWallet().setBalance(b);

					String log1 = new java.util.Date() + "\tAmount of " + amount
							+ " Debited from Wallet towards Wallet linked with Number " + sourceMobileNo
							+ ". Balance in Wallet : " + b;
					Transactions t1 = new Transactions(sourceMobileNo, log1);
					Transactions t2 = repot.save(t1);
					Customer flag1 = repo.save(bx);

					c = c.add(amount);
					cx.getWallet().setBalance(c);

					String log2 = new java.util.Date() + "\tAmount of " + amount
							+ " Credited to Wallet from Wallet linked with Number " + targetMobileNo
							+ ". Balance in Wallet : " + c;
					Transactions t3 = new Transactions(targetMobileNo, log2);
					Transactions t4 = repot.save(t3);
					Customer flag2 = repo.save(cx);
					
					if ((flag1 == bx) && (flag2 == cx) && (t2 == t1) && (t4 == t3))
					{
						return flag1;
					}
					else
					{
						throw new WalletServicesDownException("Transaction Unsuccessful! Please try again. Thank you.");
					}
				}
				else
				{
					throw new InsufficientBalanceException("Insufficient balance. Please try again.");					
				}
			}
			else
			{
				throw new WalletNotFoundException("Wallet with Entered Mobile Number(Recipient) Does NOT EXIST: Please try again.");
			}
		}else
		{
			throw new WalletNotFoundException("Wallet with Entered Mobile Number Does NOT EXIST: Please try again.");
		}
	}

	public Customer depositAmount(String mobileNo, BigDecimal amount) throws WalletNotFoundException, WalletServicesDownException {

		if(repo.findOne(mobileNo)==null)
		{
			throw new WalletNotFoundException("Wallet with Entered Mobile Number Does NOT EXIST: Please try again.");
		}
		else
		{
			Customer cust=repo.findOne(mobileNo);
			BigDecimal bal = cust.getWallet().getBalance().add(amount);
			cust.getWallet().setBalance(bal);
			Customer flag = repo.save(cust);
			String log = new java.util.Date() + "\tAmount of " + amount + " Credited to Wallet. Balance in Wallet : " + bal;
			Transactions t1 = new Transactions(mobileNo, log);
			Transactions t2 = repot.save(t1);		
			if(flag==cust && t2==t1)
			{
				return flag;
			}
			else
			{
				throw new WalletServicesDownException("Transaction Unsuccessful! Please try again. Thank you.");
			}
			}
	}

	public Customer withdrawAmount(String mobileNo, BigDecimal amount) throws WalletNotFoundException, InsufficientBalanceException, WalletServicesDownException {
		
		if(repo.findOne(mobileNo)==null)
		{
			throw new WalletNotFoundException("Wallet with Entered Mobile Number Does NOT EXIST: Please try again.");
		}
		Customer cust=repo.findOne(mobileNo);
		BigDecimal bal = cust.getWallet().getBalance();
		if(bal.compareTo(amount)>=0)
		{
			bal = bal.subtract(amount);
			cust.getWallet().setBalance(bal);
			String log = new java.util.Date() + "\tAmount of  " + amount
					+ " Debited from Wallet. Balance in Wallet : " + bal;
			Transactions t1 = new Transactions(mobileNo, log);
			Transactions t2 = repot.save(t1);
			Customer flag = repo.save(cust);
			if(flag==cust && t2==t1)
			{
				return flag;
			}
			else
			{
				throw new WalletServicesDownException("Transaction Unsuccessful! Please try again. Thank you.");
			}

	}
	else
	{
		throw new InsufficientBalanceException("Insufficient Balance. Please try again.");		
	}
}
	@Override
	public List<String> getTransaction(String mobileNo) throws WalletServicesDownException {
		List<String> l = repot.findTranscations(mobileNo);
		if(l==null)
		{
			throw new WalletServicesDownException("Operation Unsuccessful!! Please TRY again at a LATER TIME! Thanks.");
		}
		else
		{
			return l;
		}
	}

	@Override
	public List<Customer> getAllCustomers() throws WalletServicesDownException {
		List<Customer> l = repo.findAll();
		if(l==null)
		{
			throw new WalletServicesDownException("Operation Unsuccessful!! Please TRY again at a LATER TIME! Thanks.");
		}
		else
		{
			return l;
		}
	}

	@SuppressWarnings("null")
	@Override
	public List<Customer> getCustomersWhoseBalanceLessThan() throws WalletServicesDownException {
		List<Customer> l = repo.findAll();
		List<Customer> m = null;
		if(l==null)
		{
			throw new WalletServicesDownException("Operation Unsuccessful!! Please TRY again at a LATER TIME! Thanks.");
		}
		else
		{
			
			Iterator<Customer> it = l.iterator();
			while(it.hasNext())
			{
				Customer c = it.next();
				if(c.getWallet().getBalance().compareTo(new BigDecimal(1000))<0)
				{
					m.add(c);
				}
			}
			return m;
		}
	}
}
