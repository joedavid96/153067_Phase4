package com.cg.mywalletapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.mywalletapp.beans.Customer;

public interface WalletRepo extends JpaRepository<Customer, String> {
	
}
