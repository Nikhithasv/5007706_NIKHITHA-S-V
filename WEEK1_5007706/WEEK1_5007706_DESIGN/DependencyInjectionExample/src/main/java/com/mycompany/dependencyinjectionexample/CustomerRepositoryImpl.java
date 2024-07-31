/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dependencyinjectionexample;

/**
 *
 * @author nikhi
 */

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("Nikki");
        return customer;
    }
}
