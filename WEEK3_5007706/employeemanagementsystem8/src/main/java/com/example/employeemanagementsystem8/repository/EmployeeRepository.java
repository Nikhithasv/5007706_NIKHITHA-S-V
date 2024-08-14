/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.employeemanagementsystem8.repository;

/**
 *
 * @author nikhi
 */
import com.example.employeemanagementsystem8.model.Employee;
import com.example.employeemanagementsystem8.repository.EmployeeProjection;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.departmentId = :departmentId")
    List<Employee> findByDepartmentId(@Param("departmentId") Long departmentId);

    @Query("SELECT e.id as id, e.email as email FROM Employee e WHERE e.departmentId = :departmentId")
    List<EmployeeProjection> findEmployeeProjectionByDepartmentId(@Param("departmentId") Long departmentId);
    
    public Optional<Employee> findByEmail(String email);
}