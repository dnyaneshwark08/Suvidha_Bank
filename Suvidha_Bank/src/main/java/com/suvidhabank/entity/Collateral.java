package com.suvidhabank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="suvidha_dnyanesh_collateral")
public class Collateral {
	
	@Id
	private String collateralId;
	private String collateralType;
	@ManyToOne
	@JoinColumn(name="loan_Id")
	private Loan loan;

}
