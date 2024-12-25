package com.tracxe.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracxe.model.Department;

@Service
public class DepartmentDao {
  
	@Autowired
	private DepartmentRepository deptRepo;
	
	public List<Department> getAllDepartments()
	{
		return deptRepo.findAll();
	}
	
	public Department getDepartmentById(long deptId)
	{
		return deptRepo.findById(deptId).orElse(new Department());
	}
	
	public Department getDepartmentByName(String name)
	{
		return deptRepo.findByName(name).orElse(new Department());
	}
	
	public List<Department> getDepartmentByLocation(String location)
	{
		return deptRepo.findByLocation(location);
	}
	
	public Department registerDepartment(Department department)
	{
		return deptRepo.save(department);
	}
	
	public Department updateDepartment(Department department)
	{
		return deptRepo.save(department);
	}
	
	public String deleteDepartmentById(long deptId)
	{
		deptRepo.deleteById(deptId);
		return "Department with department id " + deptId + " is deleted";
	}
	
	
}
