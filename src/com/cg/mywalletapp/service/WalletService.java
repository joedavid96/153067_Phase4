package com.cg.mywalletapp.service;
import java.math.BigDecimal;
import java.util.List;

import com.cg.mywalletapp.beans.Customer;
import com.cg.mywalletapp.exception.InsufficientBalanceException;
import com.cg.mywalletapp.exception.WalletAlreadyExistsException;
import com.cg.mywalletapp.exception.WalletNotFoundException;
import com.cg.mywalletapp.exception.WalletServicesDownException;

public interface WalletService {
public Customer createAccount(Customer customer) throws WalletServicesDownException, WalletAlreadyExistsException;
public Customer showBalance (String mobileno) throws WalletNotFoundException;
public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount) throws WalletNotFoundException, InsufficientBalanceException, WalletServicesDownException;
public Customer depositAmount (String mobileNo,BigDecimal amount )throws WalletNotFoundException, WalletServicesDownException;
public Customer withdrawAmount(String mobileNo, BigDecimal amount)throws WalletNotFoundException, InsufficientBalanceException, WalletServicesDownException;
public List<String> getTransaction(String mob) throws WalletServicesDownException;
public List<Customer> getAllCustomers() throws WalletServicesDownException;
public List<Customer> getCustomersWhoseBalanceLessThan() throws WalletServicesDownException;
}
