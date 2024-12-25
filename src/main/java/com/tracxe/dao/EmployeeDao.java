package com.tracxe.dao;

import java.time.LocalDate;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tracxe.model.Employee;

@Service
public class EmployeeDao {
	@Autowired
    private EmployeeRepository empRepo;
    
    
    public List<Employee> getAllEmployees()
    {
    	return empRepo.findAll();
    }
    
    public Employee getEmployeeById(int id)
    {
    	return empRepo.findById(id).orElse(new Employee());
    }
    
    public Employee getEmployeeByName(String name)
	{
		return empRepo.findByName(name).orElse(new Employee());
	}
	
	public List<Employee> getEmployeeByCountry(String country)
	{
		return empRepo.findByCountry(country);
	}
	
	public Employee getEmployeeByEmail(String email)
	{
		return empRepo.findByEmail(email).orElse(new Employee());
	}
	
	public List<Employee> getEmployeeByGender(String gender)
	{
		return empRepo.findByGender(gender);
	}
	
	public List<Employee> getEmployeeBySalary(double salary)
	{
		return empRepo.findBySalary(salary);
	}
	
	public List<Employee> getEmployeeByDoj(LocalDate doj)
	{
		return empRepo.findByDoj(doj);
	}
	
	public Employee registerEmployee(Employee employee)
	{
		return empRepo.save(employee);
	}
	
	public Employee updateEmployee(Employee employee)
	{
		return empRepo.save(employee);
	}
	
	public String deleteEmployeeById(int empId)
	{
		empRepo.deleteById(empId);
		return "Employee with id " + empId + " is deleted";
	}
	
	public Employee login(String email , String password)
	{
		return empRepo.login(email, password);
	}
}
