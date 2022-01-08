package com.Composit.CompositExample;

import java.io.Serializable;

import javax.persistence.Id;

public class EmployeePkId implements Serializable {
	
	private int empId;
	private int depId;
	
	
	public EmployeePkId(int empId, int depId) {
		super();
		this.empId = empId;
		this.depId = depId;
	}


	public EmployeePkId() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depId;
		result = prime * result + empId;
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
		EmployeePkId other = (EmployeePkId) obj;
		if (depId != other.depId)
			return false;
		if (empId != other.empId)
			return false;
		return true;
	}
	
	
	

}
