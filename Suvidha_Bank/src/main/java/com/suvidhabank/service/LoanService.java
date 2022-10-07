package com.suvidhabank.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suvidhabank.entity.Loan;
import com.suvidhabank.repository.LoanRepository;

@Service
public class LoanService {

	@Autowired
	private LoanRepository loanRepository;
	
	public Loan findByLoanId(String loanId)
	{
		Optional<Loan> opt= this.loanRepository.findById(loanId);
		return opt.orElseThrow(()->new EntityNotFoundException("Loan with specified ID Not Found"));

	}
	public Loan applyForLoan(String loanType, double loanAmount, double loanPeriod, String remarks)
	{
		
	}
	
}
