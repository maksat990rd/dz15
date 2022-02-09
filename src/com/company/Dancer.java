package com.company;

public class Dancer extends Person {
    String grupname;

    public Dancer(String name, String designation, String grupname) {
        super(name, designation);
        this.grupname = grupname;
    }

    public void dancing() {
        System.out.println("Зажигает в клубе!");
    }
    @Override
    public String toString() {
        return name +" " + designation + " " + grupname;
    }
}
