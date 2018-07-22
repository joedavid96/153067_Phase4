package com.cg.mywalletapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.mywalletapp.beans.Transactions;

public interface TransactionRepo extends JpaRepository<Transactions, Integer> {
	@Query("select t.statements from Transactions t where t.mobileNo=?1 ORDER BY t.transactionId DESC")
	List<String> findTranscations(String mob);

}
