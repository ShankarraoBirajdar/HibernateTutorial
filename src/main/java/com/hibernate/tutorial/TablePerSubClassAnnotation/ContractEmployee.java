package com.hibernate.tutorial.TablePerSubClassAnnotation;

import javax.persistence.*;

@Entity
@Table(name="ContractEmployeesubclass")
@PrimaryKeyJoinColumn(name="ID")
public class ContractEmployee extends Employee {
	private float payPerHour;
	private String contractDuration;
	public float getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}
	public String getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}

}
