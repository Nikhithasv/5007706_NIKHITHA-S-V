/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employeemanagementsystem10.model;

/**
 *
 * @author nikhi
 */
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Formula;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
@DynamicInsert
@DynamicUpdate
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "active")
    private boolean active;

    @Formula("(select count(*) from department d where d.employee_id = id)")
    private int departmentCount;

    
}
