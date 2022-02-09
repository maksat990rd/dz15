package com.company;

public class Programmer extends Person {
    String kompaniname;

    public Programmer(String name, String designation, String kompaniname) {
        super(name, designation);
        this.kompaniname = kompaniname;
    }
    public void coding() {
        System.out.println("Sozdaet zashitu prilojeniy! ");
    }
    @Override
    public String toString() {
        return name + " " + designation + " " + kompaniname;
    }
}
