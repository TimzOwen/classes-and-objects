package com.owen;

public class Main {

    public String name;
    public int height;
    public int age;
    public String gender;

    /**
     * constructor name should same as the class name
     */
    public Main() {

    }


    //a methods for eating
    public void eat() {
        System.out.println("I am eating --");
    }

    //methods to speak
    public void speak() {
        System.out.println("I am  " + name);
        System.out.println("I am  " + age + " Years Old");
        System.out.println("I am  " + gender);
        System.out.println(name + " is " + height + "M tall");
    }

    //method for cooking
    public void cook() {
        System.out.println("cooking --");
    }

    //method for checking status
    public void getMaried() {
        System.out.println("getting Married ----");
    }
}

