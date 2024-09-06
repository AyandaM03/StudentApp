package com.mycompany.studentapp;
import java.util.*;

public class Student {
 
    private final String id;
    private final String name;
    private final int age;
    private final String email;
    private final String course;
    
     // Constructor
    public Student(String id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
        
    }
    
     // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }
    
  // Save a student to the ArrayList
    public static void SaveStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Students ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter the Students Name: ");
        String name = scanner.nextLine();
        
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter the Students Age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 16) {
                    validAge = true;
                } else {
                    System.out.println("Invalid age. Age must be 16 years or older.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for the age.");
                scanner.next(); 
            }
        }
        
        scanner.nextLine(); 

        System.out.print("Enter the Students Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the Students Course: ");
        String course = scanner.nextLine();

        students.add(new Student(id, name, age, email, course));
        System.out.println("The Students details are successfully saved.");
    }
      
      // Search for a student by ID
    public static void SearchStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Students ID to search: ");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student Found: ");
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Course: " + student.getCourse());
                return;
            }
        }
        System.out.println("Student not found.");
    }

      // Delete a student by ID
    public static void DeleteStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Students ID to delete: ");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Are you sure you want to delete this student? (yes/no): ");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("yes")) {
                    students.remove(student);
                    System.out.println("Student successfully deleted.");
                } else {
                    System.out.println("Deletion cancelled.");
                }
                return;
            }
        }
        System.out.println("Student is not found.");
    } 
    
      // Display all students' details in a report
    public static void StudentReport(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("Student Report:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge() + ", Email: " + student.getEmail() + ", Course: " + student.getCourse());
        }
    }

    // Exit the application
    public static void ExitStudentApplication() {
        System.out.println("Exiting the application...");
        System.exit(0);
    }

}

