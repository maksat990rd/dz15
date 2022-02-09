package com.company;

public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void learn() {
        System.out.println("Учится!");
    }
    public void walk() {
        System.out.println("Подрабатывает!");
    }
    public void eat() {
        System.out.println("Постоянно кушает!");
    }
}
