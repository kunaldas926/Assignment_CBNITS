package model;

import javax.persistence.Id;


public class Employee {
	@Id
	private Long empid;
	private String empname;
	private String designation;
	
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

	public Employee(Long empid, String empname, String designation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.designation = designation;
	}
}
