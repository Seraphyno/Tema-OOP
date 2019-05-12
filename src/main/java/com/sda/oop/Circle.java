package com.sda.oop;

public class Circle extends AShape {

    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
//        Math.PI * radius * radius;
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
//        2 * Math.PI * radius;
        return 2 * PI * radius;
    }
}
