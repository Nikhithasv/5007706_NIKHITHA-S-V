/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dependencyinjectionexample;

/**
 *
 * @author nikhi
 */
public class DependencyInjectionExample {

    public static void main(String[] args) {
       CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        Customer customer = service.findCustomerById("1");

        System.out.println("Customer:");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
   }
}