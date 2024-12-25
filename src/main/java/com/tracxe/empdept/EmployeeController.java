package com.tracxe.empdept;

import java.time.LocalDate;

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
import com.tracxe.dao.EmployeeDao;
import com.tracxe.model.Department;
import com.tracxe.model.Employee;
import com.tracxe.model.EmployeeDTO;

@CrossOrigin(origins = "*")
@RestController
public class EmployeeController {
	
	// creates an object for the field dynamically
	@Autowired
	private EmployeeDao empdao;
	@Autowired
	private DepartmentDao deptdao;
	
	@RequestMapping("/getAllEmployees")
	public List<Employee> getAllEmployees()
	{
		return empdao.getAllEmployees();
	}
	
	@RequestMapping("/getEmployeeById/{ID}")
	public Employee getEmployeeById(@PathVariable("ID") int empId)
	{
		return empdao.getEmployeeById(empId);
	}
	
	@RequestMapping("/getEmployeeByName/{NAME}")
	public Employee getEmployeeByName(@PathVariable("NAME") String name)
	{
		return empdao.getEmployeeByName(name);
	}
	
	@RequestMapping("/getEmployeeByCountry/{COUNTRY}")
	public List<Employee> getEmployeeByCountry(@PathVariable("COUNTRY") String country)
	{
		return empdao.getEmployeeByCountry(country);
	}
	
	@RequestMapping("/getEmployeeByEmail/{EMAIL}")
	public Employee getEmployeeByEmail(@PathVariable("EMAIL") String email)
	{
		return empdao.getEmployeeByEmail(email);
	}
	
	@RequestMapping("/getEmployeeByGender/{GENDER}")
	public List<Employee> getEmployeeByGender(@PathVariable("GENDER") String gender)
	{
		return empdao.getEmployeeByGender(gender);
	}
	
	@RequestMapping("/getEmployeeBySalary/{SALARY}")
	public List<Employee> getEmployeeBySalary(@PathVariable("SALARY") double salary)
	{
		return empdao.getEmployeeBySalary(salary);
	}
	
	@RequestMapping("/getEmployeeByDoj/{DOJ}")
	public List<Employee> getEmployeeByDoj(@PathVariable("DOJ") String doj)
	{
		LocalDate date = LocalDate.parse(doj);
		return empdao.getEmployeeByDoj(date);
	}
	
	@PostMapping("/registerEmployee")
	public Employee registerEmployee(@RequestBody EmployeeDTO employeeDto)
	{
//		return empdao.registerEmployee(employeeDto);
        Employee emp = new Employee(employeeDto.getEmpId() , employeeDto.getEmpName() , employeeDto.getSalary() , employeeDto.getGender() , employeeDto.getCountry() , employeeDto.getDoj() , employeeDto.getEmail() , employeeDto.getPassword());
        Department dept = deptdao.getDepartmentById(employeeDto.getDeptId());
        emp.setDepartment(dept);
        return empdao.registerEmployee(emp);

	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return empdao.updateEmployee(employee);
	}
	
	@DeleteMapping("/deleteEmployeeById/{ID}")
	public String deleteEmployeeById(@PathVariable("ID")int empId)
	{
		return empdao.deleteEmployeeById(empId);
	}
	
	@RequestMapping("/login/{EMAIL}/{PASSWORD}")
	public Employee login(@PathVariable("EMAIL") String email , @PathVariable("PASSWORD") String password)
	{
		return empdao.login(email, password);
	}
}
