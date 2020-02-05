package com.model.model2;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity

//@Table(name = "AllInOneEmps")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "emp_type", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("emp")

//@Inheritance(strategy=InheritanceType.JOINED)
//@Table(name="BaseEmp")

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "emp_only")
public class Emp {

	@Id
	@Column(name = "eid")
	private long eid;
	@Column
	private String ename;
	@Column
	private double basic;

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public Emp(long eid, String ename, double basic) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
	}

	public Emp() {
	}

}
