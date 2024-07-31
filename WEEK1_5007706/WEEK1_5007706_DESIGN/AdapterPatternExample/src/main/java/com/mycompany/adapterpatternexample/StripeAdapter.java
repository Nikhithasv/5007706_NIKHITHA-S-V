/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterpatternexample;

/**
 *
 * @author nikhi
 */
public class StripeAdapter implements PaymentProcessor{
    private Stripe S;

    public StripeAdapter(Stripe S) {
        this.S = S;
    }

    @Override
    public void processPayment(double amt) {
        S.makePayment(amt);
    }
}
