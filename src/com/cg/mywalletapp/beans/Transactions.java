package com.cg.mywalletapp.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transactions")
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int transactionId;
	private String mobileNo;

	private String statements;

	public Transactions() {
		super();
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getId() {
		return transactionId;
	}

	public void setId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatements() {
		return statements;
	}

	public void setStatements(String statements) {
		this.statements = statements;
	}

}
