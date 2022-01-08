package com.Composit.CompositExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity(name = "EmployeeIdClassExample")
@Table(name = "employee_IdClass")
@IdClass(EmployeePkId.class)
public class EmployeeIdClassExample {
	
	@Id
	private int empId;
	@Id
	private int depId;
	private  String name;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeIdClassExample(int empId, int depId, String name) {
		super();
		this.empId = empId;
		this.depId = depId;
		this.name = name;
	}
	public EmployeeIdClassExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
