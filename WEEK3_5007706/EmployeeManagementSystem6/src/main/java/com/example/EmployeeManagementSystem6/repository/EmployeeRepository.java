/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.EmployeeManagementSystem6.repository;

/**
 *
 * @author nikhi
 */
import com.example.EmployeeManagementSystem6.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.awt.print.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

    // Find all employees with pagination
    Page<Employee> findAll(Pageable pageable);

    // Find employees by last name with pagination
    Page<Employee> findByLastName(String lastName, Pageable pageable);

    // Find employees by department id with pagination
    Page<Employee> findByDepartmentId(Long departmentId, Pageable pageable);
}