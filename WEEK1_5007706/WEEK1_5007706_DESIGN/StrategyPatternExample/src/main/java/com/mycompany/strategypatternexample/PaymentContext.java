/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategypatternexample;

/**
 *
 * @author nikhi
 */
public class PaymentContext {
    private PaymentStrategy ps;

    public void setPaymentStrategy(PaymentStrategy ps) {
        this.ps = ps;
    }

    public void pay(double amount) {
        if (ps == null) {
            System.out.println("Please select a payment method first.");
        } else {
            ps.pay(amount);
        }
    }
}