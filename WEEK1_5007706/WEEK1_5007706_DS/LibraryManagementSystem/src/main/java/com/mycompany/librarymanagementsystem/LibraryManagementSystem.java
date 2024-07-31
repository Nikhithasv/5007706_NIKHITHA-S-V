/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagementsystem;

/**
 *
 * @author nikhi
 */
import java.util.Scanner;

class Book {
    private String bookId;
    private String title;
    private String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

class LinearSearch {
    public static int linearSearch(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }
}

class BinarySearch {
    public static int binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = title.compareToIgnoreCase(books[mid].getTitle());

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
}

class SortBooks {
    public static void sortBooks(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j].getTitle().compareToIgnoreCase(books[j + 1].getTitle()) > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book[] books = {
            new Book("1", "Think like a monk", "Jayshetty"),
            new Book("2", "Atomic habits", "James clear")
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Search Method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the title of the book to search: ");
        String title = scanner.nextLine();

        if (choice == 1) {
            
            System.out.println("Linear Search:");
            int index = LinearSearch.linearSearch(books, title);
            if (index != -1) {
                System.out.println("Book found: " + books[index]);
            } else {
                System.out.println("Book not found.");
            }
        } else if (choice == 2) {
            
            SortBooks.sortBooks(books);

            System.out.println("Binary Search:");
            int index = BinarySearch.binarySearch(books, title);
            if (index != -1) {
                System.out.println("Book found: " + books[index]);
            } else {
                System.out.println("Book not found.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

    }
}

