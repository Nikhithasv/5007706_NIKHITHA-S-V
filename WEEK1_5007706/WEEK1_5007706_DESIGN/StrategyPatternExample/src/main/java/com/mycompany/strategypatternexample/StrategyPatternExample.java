/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strategypatternexample;

/**
 *
 * @author nikhi
 */
public class StrategyPatternExample {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe", "123", "12/23"));
        context.pay(250);

        context.setPaymentStrategy(new PayPalPayment("john.doe@example.com", "password123"));
        context.pay(150);
    }
}
