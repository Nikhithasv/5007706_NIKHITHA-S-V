/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortingorders;

/**
 *
 * @author nikhi
 */
import java.util.Scanner;

class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

class BubbleSort {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].getTotalPrice() < orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }
}

class QuickSort {
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        Order pivot = orders[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() > pivot.getTotalPrice()) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
}

public class sortingorders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Order[] orders = {
            new Order("1", "a", 500),
            new Order("2", "b", 120),
            new Order("3", "c", 300),
            new Order("4", "e", 78),
            new Order("5", "d", 200)
        };

        while (true) {
            System.out.println("\nWelcome to the E-commerce Order Management System!");
            System.out.println("1. Display Orders");
            System.out.println("2. Sort Orders using Bubble Sort");
            System.out.println("3. Sort Orders using Quick Sort");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Order List:");
                    for (Order order : orders) {
                        System.out.println("Order ID: " + order.getOrderId() + 
                                           ", Customer: " + order.getCustomerName() + 
                                           ", Total Price: " + order.getTotalPrice());
                    }
                    break;
                
                case 2:
                   
                    BubbleSort.bubbleSort(orders);
                    System.out.println("Orders sorted using Bubble Sort.");
                    break;
                
                case 3:
                    QuickSort.quickSort(orders, 0, orders.length - 1);
                    System.out.println("Orders sorted using Quick Sort.");
                    break;
                
                case 4:
                   
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

