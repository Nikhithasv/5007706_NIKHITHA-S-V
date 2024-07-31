/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodpatternexample;

/**
 *
 * @author nikhi
 */
public class PdfDocument implements document {
    @Override
    public void Open() {
        System.out.println("Opening PDF document.");
    }
}