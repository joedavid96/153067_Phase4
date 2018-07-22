package com.cg.mywalletapp.service;
import java.math.BigDecimal;
import java.util.List;

import com.cg.mywalletapp.beans.Customer;
import com.cg.mywalletapp.exception.InsufficientBalanceException;
import com.cg.mywalletapp.exception.InvalidInputException;

public interface WalletService {
public Customer createAccount(Customer customer);
public Customer showBalance (String mobileno);
public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount) throws InvalidInputException, InsufficientBalanceException;
public Customer depositAmount (String mobileNo,BigDecimal amount )throws InvalidInputException;
public Customer withdrawAmount(String mobileNo, BigDecimal amount)throws InvalidInputException, InsufficientBalanceException;
public List<String> getTransaction(String mob);
}
