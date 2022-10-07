package com.suvidhabank.repository;

import org.springframework.data.repository.CrudRepository;

import com.suvidhabank.entity.Loan;

public interface LoanRepository extends CrudRepository<Loan, String> {

}
