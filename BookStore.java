/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.books;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Books {

    public static void main(String[] args) {

        Book book = new book();

        book.setTitle(" Deep Blue Sea ");
        book.setAuthor(" Gordan Ramsey ");
        book.setPrice(400.00);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());

    }
}
