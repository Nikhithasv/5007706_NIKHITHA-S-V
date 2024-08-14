/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EmployeeManagementSystem6.service;

/**
 *
 * @author nikhi
 */
import com.example.EmployeeManagementSystem6.model.Employee;
import com.example.EmployeeManagementSystem6.model.Department;
import com.example.EmployeeManagementSystem6.repository.EmployeeRepository;
import com.example.EmployeeManagementSystem6.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees with pagination
    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    // Get employees by last name with pagination
    public Page<Employee> getEmployeesByLastName(String lastName, Pageable pageable) {
        return employeeRepository.findByLastName(lastName, (java.awt.print.Pageable) pageable);
    }

    // Get employees by department id with pagination
    public Page<Employee> getEmployeesByDepartmentId(Long departmentId, Pageable pageable) {
        return employeeRepository.findByDepartmentId(departmentId, (java.awt.print.Pageable) pageable);
    }


}