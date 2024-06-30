package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Zarif");

        Sqare s = new Sqare(5);
        System.out.println("Площадь квадрата " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь второго квадрата " + r.a + " и " + r.b + " = " + area(r));

    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(Sqare s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }
}