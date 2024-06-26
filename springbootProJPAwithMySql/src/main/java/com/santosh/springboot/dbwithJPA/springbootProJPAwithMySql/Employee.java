package com.santosh.springboot.dbwithJPA.springbootProJPAwithMySql;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@Id
	private Integer empId;
	private String empName;
	private String empDept;
	private Double empSal;
	
	// Default Constructor
	public Employee() {
		
	}
	
	public Employee(Integer empId, String empName, String empDept, Double empsal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSal = empsal;
		
	}
	// Getter/ Setter EmpId
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	// Getter/ Setter EmpName
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	// Getter/ Setter EmpDept
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	// Getter/ Setter EmpSalary
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	

	

}
