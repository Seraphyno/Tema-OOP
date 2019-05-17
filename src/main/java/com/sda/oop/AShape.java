package com.sda.oop;

public abstract class AShape {

    /**
     * Returns shape's area
     * @return area as double
     */
    public abstract double getArea();

    /**
     * Returns shape's perimeter
     * @return perimeter as double
     */
    public abstract double getPerimeter();

    public void someMethod(int i) {
        System.out.println("Hello, " + i);
    }
}
