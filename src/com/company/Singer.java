package com.company;

public class Singer extends Person {
     String bandname;

    public Singer(String name, String designation, String bandname) {
        super(name, designation);
        this.bandname = bandname;
    }

    public void singing() {
        System.out.println("Поет в ресторанах!");
    }
    public void playgitar() {
        System.out.println("Играет на гитаре в подземках!");
    }
    @Override
    public String toString() {
        return name + " " + designation + " " + bandname;
    }
}
