/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterpatternexample;

/**
 *
 * @author nikhi
 */
public class GooglePayAdapter implements PaymentProcessor {
    private GooglePay GPay;

    public GooglePayAdapter(GooglePay GPay) {
        this.GPay = GPay;
    }

    @Override
    public void processPayment(double amt) {
        GPay.makePayment(amt);
    }
}
