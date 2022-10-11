package com.suvidhabank.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "s_employee_danny")
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	@JsonIgnore
	@OneToOne(mappedBy = "employee")
	private Loan loan;
}
