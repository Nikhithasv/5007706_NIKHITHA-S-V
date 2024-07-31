/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decoratorpatternexample;

/**
 *
 * @author nikhi
 */
import java.util.*;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        System.out.println("--------------------------------------");
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        
         slackNotifier.send(s);
         System.out.println("--------------------------------------");
    }
}
