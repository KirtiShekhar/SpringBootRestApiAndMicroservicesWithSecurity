package com.springboot.bankingsecurity.repository;

import com.springboot.bankingsecurity.entity.AccountTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionsRepository  extends JpaRepository<AccountTransactions,Long>
{
    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(Long customerId);
}
