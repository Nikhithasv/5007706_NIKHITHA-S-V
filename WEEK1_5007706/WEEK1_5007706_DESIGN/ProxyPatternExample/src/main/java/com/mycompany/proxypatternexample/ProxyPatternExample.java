/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxypatternexample;

/**
 *
 * @author nikhi
 */
public class ProxyPatternExample {

     public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");
        
        image1.display();
        System.out.println("");

        image2.display();
        System.out.println("");
        
    }
}
