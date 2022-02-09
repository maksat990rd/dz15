package com.company;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Гуфи", "Программист", "KICB");
        System.out.println(programmer);
        programmer.coding();
        programmer.eat();
        programmer.learn();
        programmer.walk();
        System.out.println();

        Dancer dancer = new Dancer("Марсель: ", "Танцор: ", "GoGo!");
        System.out.println(dancer);
        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();
        System.out.println();

        Singer singer = new Singer("Кристоф Шнайдер", "Гитарист!: ","Рамштайн!");
        System.out.println(singer);
        singer.singing();
        singer.playgitar();
        singer.eat();
        singer.learn();
        singer.walk();
    }
}
