package com.example.springpro.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class EmployeeDto implements Serializable {
	@Id
	@GenericGenerator(name = "any", strategy = "increment")
	@GeneratedValue(generator = "any")
	private int id;
	private String empName;
	private String empid;
	private long empAge;
	private long empNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public long getEmpAge() {
		return empAge;
	}

	public void setEmpAge(long empAge) {
		this.empAge = empAge;
	}

	public long getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(long empNumber) {
		this.empNumber = empNumber;
	}
}
