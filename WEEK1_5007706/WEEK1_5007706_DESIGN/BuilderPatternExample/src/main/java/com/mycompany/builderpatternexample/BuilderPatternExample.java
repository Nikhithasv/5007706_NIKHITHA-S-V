/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.builderpatternexample;

/**
 *
 * @author nikhi
 */
public class BuilderPatternExample {

    public static void main(String[] args) {
        
        Computer pc1 = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .build();

        System.out.println("pc1 Configuration:");
        System.out.println("CPU: " + pc1.getCPU());
        System.out.println("RAM: " + pc1.getRAM());
        System.out.println("Storage: " + pc1.getStorage());
        
        Computer pc2 = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println("\npc2 Configuration:");
        System.out.println("CPU: " +pc2.getCPU());
        System.out.println("RAM: " + pc2.getRAM());
        System.out.println("Storage: " + pc2.getStorage());
    }
}
