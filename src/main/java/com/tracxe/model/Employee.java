package com.tracxe.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
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
   @ManyToOne(cascade = CascadeType.PERSIST)
   @JoinColumn(name = "deptId")
   private Department department;
   public Employee() 
   {
     
   }																																																																																																							
    
   
   public Employee(int empId, String empName, double salary, String gender, String country, LocalDate doj, String email,
		String password) 
   {
	 this.empId = empId;
	 this.empName = empName;
	 this.salary = salary;
	 this.gender = gender;
	 this.country = country;
	 this.doj = doj;
	 this.email = email;
	 this.password = password;
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

   public Department getDepartment(){
		return department;
	}
   
   public void setDepartment(Department department) {
	this.department = department;
   }
	
	




@Override
   public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", gender=" + gender
			+ ", country=" + country + ", doj=" + doj + ", email=" + email + ", password=" + password + "]";
   }  
}
