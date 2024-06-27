package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("zero");
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}