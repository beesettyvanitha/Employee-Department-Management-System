package com.tracxe.empdept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracxe.dao.DepartmentDao;
import com.tracxe.model.Department;

@CrossOrigin(origins = "*")
@RestController
public class DepartmentController {
	@Autowired
	private DepartmentDao deptDao;

	@RequestMapping("/department")
	public Department showDepartment()
	{
		return new Department(210 , "Computer Science & Engineering", "180, Main Building");
	}
	
	@RequestMapping("/getAllDepartments")
	public List<Department> getAllDepartments()
	{
		return deptDao.getAllDepartments();
	}
	
	@RequestMapping("/getDepartmentById/{ID}")
	public Department getDepartmentById(@PathVariable("ID")int deptId)
	{
		return deptDao.getDepartmentById(deptId);
	}
	
	@RequestMapping("/getDepartmentByName/{NAME}")
	public Department getDepartmentByName(@PathVariable("NAME")String name)
	{
		return deptDao.getDepartmentByName(name);
	}
	
	@RequestMapping("/getDepartmentByLocation/{LOCATION}")
	public List<Department> getDepartmentByLocation(@PathVariable("LOCATION")String location)
	{
		return deptDao.getDepartmentByLocation(location);
	}
	
	@PostMapping("/registerDepartment")
	public Department registerDepartment(@RequestBody Department department)
	{
		return deptDao.registerDepartment(department);
	}
	
	@PutMapping("/updateDepartment")
	public Department updateDepartment(@RequestBody Department department)
	{
		return deptDao.updateDepartment(department);
	}
	
	@DeleteMapping("/deleteDepartmentById/{ID}")
	public String deleteDepartmentById(@PathVariable("ID")int deptId)
	{
		return deptDao.deleteDepartmentById(deptId);
	}
	
	
}

