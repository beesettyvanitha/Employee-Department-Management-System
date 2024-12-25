package com.tracxe.dao;

import java.time.LocalDate;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.tracxe.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Integer> {
	@Query("from Employee e where e.empName = :name")  
	Optional<Employee> findByName(@Param("name") String name);
	Optional<Employee> findByEmail(String email);
	List<Employee> findByGender(String gender);
	List<Employee> findByCountry(String country);
	List<Employee> findBySalary(double Salary);
	List<Employee> findByDoj(LocalDate doj);
	@Query("from Employee e where e.email = :email AND e.password = :password")  
	Employee login(@Param("email")String email , @Param("password")String password);
}
