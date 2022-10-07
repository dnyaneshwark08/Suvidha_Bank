package com.suvidhabank.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="suvidha_dnyanesh_loan")
public class Loan {

	@Id
	private String loanId;
	private String loanType;
	private double loanAmount;
	private double interestRate;
	private double loanPeriod;
	private boolean isapproved;
	private String remarks;
	
	@OneToOne
	@JoinColumn(name="customer_Id")
	private Customer customer;
	@OneToOne
	@JoinColumn(name="employee_Id")
	private Employee employee;
	@OneToMany(mappedBy = "loan")
	private List<Collateral> collaterals;
	
	
}
