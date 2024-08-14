/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.employeemanagementsystem8.repository;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author nikhi
 */
public interface EmployeeProjection {
    @Value("#{target.id}")
    Long getId();

    @Value("#{target.email}")
    String getEmail();
}
