package com.sda.oop;

public class Main {

    public static void main(String[] args) {
        AShape circle = new Circle(3D);
        AShape square = new Square(2);
        AShape rectangle = new Rectangle(4, 2);

        printObject(circle);
        printObject(square);
        printObject(rectangle);
    }

    private static void printObject(AShape shape) {
        String response = String.format("%s with perimeter: %d and area: %d",
                                shape.getClass().getSimpleName(),
                                shape.getPerimeter(),
                                shape.getArea());
        System.out.println(response);
    }
}
