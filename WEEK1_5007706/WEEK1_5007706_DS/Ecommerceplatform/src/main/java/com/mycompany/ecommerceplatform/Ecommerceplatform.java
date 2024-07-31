/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommerceplatform;

/**
 *
 * @author nikhi
 */
import java.util.*;

class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }
}

class LinearSearch {
    public static int linearSearch(Product[] products, String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(productName)) {
                return i;
            }
        }
        return -1;
    }
    //tc: O(n)
}

class BinarySearch {
    public static int binarySearch(Product[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = productName.compareToIgnoreCase(products[mid].getProductName());

            if (result == 0) {
                return mid;
            }

            if (result > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    //tc : O(log n)
}

class SortProducts {
    public static void sortProducts(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - 1 - i; j++) {
                if (products[j].getProductName().compareToIgnoreCase(products[j + 1].getProductName()) > 0) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }
}

public class Ecommerceplatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[0];

        while (true) {
            System.out.println("\nWelcome to the E-commerce Platform!");
            System.out.println("1. Add Product");
            System.out.println("2. Perform Search");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                
                    System.out.print("Enter product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product category: ");
                    String category = scanner.nextLine();

                    
                    Product[] newProducts = new Product[products.length + 1];
                    System.arraycopy(products, 0, newProducts, 0, products.length);
                    newProducts[products.length] = new Product(productId, productName, category);
                    products = newProducts;

                    System.out.println("Product added successfully!");
                    break;

                

                case 2:
                    
                    System.out.println("Choose search method:");
                    System.out.println("1. Linear Search(O(n))");
                    System.out.println("2. Binary Search (O(log n))");
                    System.out.print("Enter your choice: ");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine();  

                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();

                    if (searchChoice == 1) {
                        int linearIndex = LinearSearch.linearSearch(products, searchName);
                        if (linearIndex != -1) {
                            System.out.println("Product found: " + products[linearIndex].getProductName());
                        } else {
                            System.out.println("Product not found.");
                        }
                    } else if (searchChoice == 2) {
                        int binaryIndex = BinarySearch.binarySearch(products, searchName);
                        if (binaryIndex != -1) {
                            System.out.println("Product found: " + products[binaryIndex].getProductName());
                        } else {
                            System.out.println("Product not found.");
                        }
                    } else {
                        System.out.println("Invalid search choice.");
                    }
                    break;

                case 3:
                    
                    System.out.println("Exiting the platform. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
}
}

