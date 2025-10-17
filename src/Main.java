/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mycha Shem Jimenea
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    addStudent(students, sc);
                    break;
                case 2:
                    viewStudent(students);
                    break;
                case 3:
                    searchStudent(students, sc);
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice !=4);
    }
    private static void addStudent(ArrayList<Student> students, Scanner sc){
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        
        students.add(new Student(id, name, age));
        System.out.println("Student added successfully.");
    }
    private static void viewStudent(ArrayList<Student> students){
        if (students.isEmpty()){
            System.out.println("No students to display.");
        } else {
            for (Student s : students){
                s.display();
            }
        }
    }
    private static void searchStudent(ArrayList<Student> students, Scanner sc){
        System.out.println("Enter Id to search: ");
        int id = sc.nextInt();
        boolean found = false;
        
        for(Student s : students){
            if (s.id == id){
                s.display();
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Student not found.");
        }
    }
}
