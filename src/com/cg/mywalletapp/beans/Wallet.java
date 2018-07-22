package com.cg.mywalletapp.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Wallet")
public class Wallet {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int walletId;
	private BigDecimal balance;

	public Wallet() {
		super();
	}

	public Wallet(BigDecimal amount) {
		this.balance = amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return ", balance=" + balance;
	}
}
