/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.employeemanagementsystem10.repository;

/**
 *
 * @author nikhi
 */
import com.example.employeemanagementsystem10.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Find employees by their last name
    List<Employee> findByLastName(String lastName);

    // Find employees by their department id
    List<Employee> findByDepartmentId(Long departmentId);

    // Find employees by their first name and last name
    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

    // Count employees by department id
    Long countByDepartmentId(Long departmentId);
    
   

    @Query("SELECT e FROM Employee e WHERE e.lastName = :lastName")
    List<Employee> findEmployeesByLastName(@Param("lastName") String lastName);

    @Query("SELECT e FROM Employee e WHERE e.department.id = :departmentId")
    List<Employee> findEmployeesByDepartmentId(@Param("departmentId") Long departmentId);

    @Query("SELECT e FROM Employee e WHERE e.firstName = :firstName AND e.lastName = :lastName")
    List<Employee> findEmployeesByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    @Query("SELECT COUNT(e) FROM Employee e WHERE e.department.id = :departmentId")
    Long countEmployeesByDepartmentId(@Param("departmentId") Long departmentId);
    
    /**
     *
     */
    @PersistenceContext
    
    default List<Employee> findEmployeesByLastNameUsingNamedQuery(String lastName) {
        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findByLastName", Employee.class);
        query.setParameter("lastName", lastName);
        return query.getResultList();
    }

    default List<Employee> findEmployeesByDepartmentIdUsingNamedQuery(Long departmentId) {
        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findByDepartmentId", Employee.class);
        query.setParameter("departmentId", departmentId);
        return query.getResultList();
    }

    public Optional<Employee> findByEmail(String email);

}
