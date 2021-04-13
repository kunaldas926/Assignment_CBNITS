package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
    @Id
    private Long EmpID;
    private String EmpName;

    public Long getEmpID() {
        return EmpID;
    }

    public void setEmpID(Long empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    private String Designation;
}