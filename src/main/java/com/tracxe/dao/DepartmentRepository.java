package com.tracxe.dao;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tracxe.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	@Query("from Department d where d.deptName = :name")  
	Optional<Department> findByName(@Param("name") String name);
	
	List<Department> findByLocation(String location);
	
}
