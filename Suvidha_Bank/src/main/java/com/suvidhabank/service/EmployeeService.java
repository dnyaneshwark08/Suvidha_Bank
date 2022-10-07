package com.suvidhabank.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.suvidhabank.entity.Customer;
import com.suvidhabank.entity.Employee;
import com.suvidhabank.entity.Loan;
import com.suvidhabank.repository.EmployeeRepository;

public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public boolean serachByEmployeeId(Employee employee)
	{
		if(!this.employeeRepository.existsById(employee.getEmployeeId()))
		{
			this.employeeRepository.save(employee);
			return true;
		}
		return false;
	}
	
	public void approveLoan(Loan loan,Customer customer)
	{
		if(customer.getAnnualIncome()*10<loan.getLoanAmount() 
				&& loan.getCollaterals().size() >0
				&& customer.isIncomeTaxreturnAttatched()== true && 
				customer.getCustomerIdentity()!=null)
		{
			loan.setIsapproved(true);
		}
		loan.setIsapproved(false);
	}
	
}
