/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterpatternexample;

/**
 *
 * @author nikhi
 */
public class PhonePeAdapter implements PaymentProcessor{
    
    private PhonePe PP;

    public PhonePeAdapter(PhonePe PP) {
        this.PP = PP;
    }

    @Override
    public void processPayment(double amt) {
        PP.makePayment(amt);
    }
}
