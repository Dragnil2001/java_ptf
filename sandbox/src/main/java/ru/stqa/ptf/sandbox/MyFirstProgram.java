package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Zarif");

        Sqare s = new Sqare(5);
        System.out.println("Площадь квадрата " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь второго квадрата " + r.a + " и " + r.b + " = " + r.area());

    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}