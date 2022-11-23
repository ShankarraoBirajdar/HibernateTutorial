package com.hibernate.tutorial.TablePerHierarchyAnnotaion;

import javax.persistence.*;

@Entity
@DiscriminatorValue("ContractEmployee")
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