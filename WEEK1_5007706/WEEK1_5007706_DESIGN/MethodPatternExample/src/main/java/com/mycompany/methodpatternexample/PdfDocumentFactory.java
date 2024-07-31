/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodpatternexample;

/**
 *
 * @author nikhi
 */
public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public document createDocument() {
        return new PdfDocument();
    }
}
