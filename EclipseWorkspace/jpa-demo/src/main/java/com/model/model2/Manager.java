package com.model.model2;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("mang")
//@Table(name="mgrs")
@Table(name = "mgrs_only")

public class Manager extends Emp {
	@Column(name = "hra")
	private double allowance;

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public Manager(long eid, String ename, double basic, double allowance) {
		super(eid, ename, basic);
		this.allowance = allowance;
	}

	public Manager() {
	}
}
