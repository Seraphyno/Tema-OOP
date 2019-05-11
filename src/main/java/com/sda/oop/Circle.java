package com.sda.oop;

public class Circle extends AShape {

    private static final double PI = Math.PI;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    int getArea() {
        return (int)(PI * radius * radius);
    }

    int getPerimeter() {
        return (int)(2 * PI * radius);
    }
}
