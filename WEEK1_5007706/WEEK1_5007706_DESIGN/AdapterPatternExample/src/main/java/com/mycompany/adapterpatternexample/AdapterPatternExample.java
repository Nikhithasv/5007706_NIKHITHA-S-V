/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapterpatternexample;

/**
 *
 * @author nikhi
 */

import java.util.*;

public class AdapterPatternExample {

    public static void main(String[] args) {
        
        Scanner s=new Scanner (System.in);
        System.out.println("--------------------------------------");
        System.out.println(" Implementing the Adapter Pattern");
        System.out.println("---------------------------------------");
        System.out.println("Enter the amount to be sent");
        double amt=s.nextDouble();
        System.out.println("---------------------------------------");
        System.out.println("Choose the Payment Platform");
        System.out.println("1) GPay \n 2) PayPal \n 3) PhonePe \n 4) Stripe");
        System.out.println("----------------------------------------");
        int choice=s.nextInt();
        PaymentProcessor GpayProcessor = new GooglePayAdapter(new GooglePay());
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPal());
        PaymentProcessor PhonePeProcessor = new PhonePeAdapter(new PhonePe());
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        switch(choice)
        {
            
            case 1:
                   GpayProcessor.processPayment(amt);
                   break;
            case 2:
                   payPalProcessor.processPayment(amt);
                   break;
            case 3:
                   PhonePeProcessor.processPayment(amt);
                   break;
            case 4:
                   stripeProcessor.processPayment(amt);
                   break;
        }
       
    }
}
