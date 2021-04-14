package com.example.demo;

import javax.persistence.*;

@Entity
class Employee {

	private @Id Long empid;
	private String empname;
	private String designation;

	Employee() {}



	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((designation == null) ? 0 : designation.hashCode());
	result = prime * result + ((empid == null) ? 0 : empid.hashCode());
	result = prime * result + ((empname == null) ? 0 : empname.hashCode());
	return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		return true;
		if (obj == null)
		return false;
		if (getClass() != obj.getClass())
		return false;
		Employee other = (Employee) obj;
		if (designation == null) {
		if (other.designation != null)
		return false;
	} else if (!designation.equals(other.designation))
	return false;
	if (empid == null) {
	if (other.empid != null)
	return false;
	} else if (!empid.equals(other.empid))
	return false;
	if (empname == null) {
	if (other.empname != null)
	return false;
	} else if (!empname.equals(other.empname))
	return false;
	return true;
	}

	@Override
	public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", designation=" + designation + "]";
	}

}