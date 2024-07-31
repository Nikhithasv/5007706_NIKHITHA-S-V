/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventorymanagementsystem;

/**
 *
 * @author nikhi
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        // tc: O(1)
    }

   
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found in the inventory.");
        }
        // tc: O(1)
    }
    
    public void deleteProduct(String productId) {
        inventory.remove(productId);
        // tc: O(1)
    }

   
    public Product getProduct(String productId) {
        return inventory.get(productId);
        // tc: O(1)
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println("ID: " + product.getProductId() +
                    ", Name: " + product.getProductName() +
                    ", Quantity: " + product.getQuantity() +
                    ", Price: " + product.getPrice());
        }
    }

    
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Inventory Management System:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    String addId = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int addQuantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double addPrice = scanner.nextDouble();
                    scanner.nextLine(); 
                    Product newProduct = new Product(addId, addName, addQuantity, addPrice);
                    ims.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.print("Enter product ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new product name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int updateQuantity = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    double updatePrice = scanner.nextDouble();
                    scanner.nextLine();
                    Product updatedProduct = new Product(updateId, updateName, updateQuantity, updatePrice);
                    ims.updateProduct(updatedProduct);
                    System.out.println("Product updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter product ID to delete: ");
                    String deleteId = scanner.nextLine();
                    ims.deleteProduct(deleteId);
                    System.out.println("Product deleted successfully.");
                    break;
                case 4:
                    System.out.println("Displaying all products:");
                    ims.displayInventory();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Inventory Management System.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}
