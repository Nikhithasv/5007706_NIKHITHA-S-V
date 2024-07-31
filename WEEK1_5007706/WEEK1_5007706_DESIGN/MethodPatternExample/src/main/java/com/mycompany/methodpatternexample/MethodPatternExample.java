/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodpatternexample;

/**
 *
 * @author nikhi
 */
public class MethodPatternExample {

    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        document wordDoc = wordFactory.createDocument();
        wordDoc.Open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        document pdfDoc = pdfFactory.createDocument();
        pdfDoc.Open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        document excelDoc = excelFactory.createDocument();
        excelDoc.Open();
    }
}
