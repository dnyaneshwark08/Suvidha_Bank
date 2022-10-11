package com.suvidhabank.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.suvidhabank.project.entity.Collateral;
import com.suvidhabank.project.entity.Customer;
import com.suvidhabank.project.entity.Employee;
import com.suvidhabank.project.entity.Loan;
import com.suvidhabank.project.repository.LoanRepository;
import com.suvidhabank.project.service.EmployeeService;

@SpringBootApplication
public class SuvidhaBankApplication {
	@Autowired
	LoanRepository loanRepository;
	
	@Autowired
	EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(SuvidhaBankApplication.class, args);
	}
	
	
	
	@Bean
	public void initialize() {
		Customer c1=new Customer();
		c1.setCustomerIdentity("56");
		c1.setCustomerName("Dani");
		c1.setCustomerAddress("Pune");
		c1.setEmailId("Dani@123");
		c1.setAnnualIncome(200000.0);
		c1.setIncomeTaxReturnAttached(false);
		
		Loan l1=new Loan();
		l1.setLoanId("1002");
		l1.setLoanType("Vehicle");
		l1.setLoanAmount(4000.0);
		l1.setInterestRate(4300.0);
		l1.setPeriod(4.0);
		l1.setRemarks("No income tax attached");
		l1.setCustomer(c1);
		
		
		
		
		for(int i=110;i<120;i++) {
			Employee e=new Employee();
			e.setEmployeeId(""+i);
			e.setEmployeeName("Employee"+(i-100));
			this.employeeService.addEmployee(e);
		}
		
		Collateral co=new Collateral();
		co.setCollateralId("2001");
		co.setCollateralType("Vehicle");
//		co.setLoan(l1);
		
		Collateral co1=new Collateral();
		co1.setCollateralId("2002");
		co1.setCollateralType("Fixed Deposit");
//		co1.setLoan(l1;
		
		List<Collateral> list=Arrays.asList(co,co1);
		
//		l1.setCollaterals(list);
//     	l1.setEmployee(e);
     	
     	this.loanRepository.save(l1);
	}

}
