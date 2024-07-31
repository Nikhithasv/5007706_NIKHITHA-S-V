/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorpatternexample;

/**
 *
 * @author nikhi
 */

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String Message) {
        super.send(Message);
        sendSMS(Message);
    }

    private void sendSMS(String Message) {
        System.out.println("Sending SMS  \" " + Message+" \"");
    }
}


