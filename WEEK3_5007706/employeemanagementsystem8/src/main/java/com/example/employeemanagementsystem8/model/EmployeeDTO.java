/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employeemanagementsystem8.model;

/**
 *
 * @author nikhi
 */
import lombok.Getter;

@Getter
public class EmployeeDTO {

    private final Long id;
    private final String email;

    public EmployeeDTO(Long id, String email) {
        this.id = id;
        this.email = email;
    }
}
