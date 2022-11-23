package com.hibernate.tutorial.TablePerConcreteAnnotation;

import javax.persistence.*;

@Entity
@Table(name="ContractrEmployeeConcrete")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name")
	)})
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
