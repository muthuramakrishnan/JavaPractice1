package com.muthu;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate dob;

    public String getName() {
        return name;
    }

    public void setName(String petName) {
        this.name = petName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String toString() {
        return "Pet: {name: " + name + '\'' + ", dob: " + dob + " }";
    }
    public static void main(String[] args){
        Pet p = new Pet();
        p.setName("dog");
        System.out.println(p);
    }
}
