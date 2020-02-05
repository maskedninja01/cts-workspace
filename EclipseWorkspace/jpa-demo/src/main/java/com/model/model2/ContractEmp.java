package com.model.model2;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("cemp")
//@Table(name="cemps")
@Table(name="cemp_only")
public class ContractEmp extends Emp {

	@Column(name = "cdur")
	private double duration;

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public ContractEmp(long eid, String ename, double basic, double duration) {
		super(eid, ename, basic);
		this.duration = duration;
	}

	public ContractEmp() {
	}

}
