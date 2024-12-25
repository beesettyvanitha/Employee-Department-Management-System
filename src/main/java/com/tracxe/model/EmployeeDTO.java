package com.tracxe.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empName;
    private double salary;
    private String gender;
    private String country;
    private LocalDate doj;
    private String email;
    private String password;
    private long deptId;
    
    public EmployeeDTO()
    {
    	
    }
	   
	public EmployeeDTO(int empId, String empName, double salary, String gender, String country, LocalDate doj,
			String email, String password, long deptId) 
	{
	
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.gender = gender;
		this.country = country;
		this.doj = doj;
		this.email = email;
		this.password = password;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", gender=" + gender
				+ ", country=" + country + ", doj=" + doj + ", email=" + email + ", password=" + password + ", deptId="
				+ deptId + "]";
	}
	   

}
