package com.mycompany.studentapp;

import java.util.ArrayList;

public class StudentApp {

    public static void main(String[] args) {
       ArrayList<Student> students = new ArrayList<>();
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("\nAKA Magocoba College Database");
            System.out.println("1. Capture New Student");
            System.out.println("2. Search for Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View Student Report");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = new java.util.Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    Student.SaveStudent(students);
                    break;
                case 2:
                    Student.SearchStudent(students);
                    break;
                case 3:
                    Student.DeleteStudent(students);
                    break;
                case 4:
                    Student.StudentReport(students);
                    break;
                case 5:
                    Student.ExitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}   
    

