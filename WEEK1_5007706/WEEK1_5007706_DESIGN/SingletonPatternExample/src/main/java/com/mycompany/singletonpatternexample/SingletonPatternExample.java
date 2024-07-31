/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletonpatternexample;

/**
 *
 * @author nikhi
 */
public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger1 = Logger.output();
        Logger logger2 = Logger.output();

        logger1.log("log1");
        logger2.log("log2");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}
