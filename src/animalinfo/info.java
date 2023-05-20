package animalinfo;

import mammal.mammal;

public class info implements mammal {
    private String name;
    private int age;

    public info(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}