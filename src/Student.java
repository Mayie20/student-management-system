/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mycha Shem Jimenea
 */
public class Student {
    int id;
    String name;
    int age;
    
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("ID: " + id + "Name: " + name + "Age: " + age);
    }
}
