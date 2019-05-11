package com.sda.oop;

public class Square extends AShape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    int getArea() {
        return side * side;
    }

    int getPerimeter() {
        return 4 * side;
    }
}
