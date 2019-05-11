package com.sda.oop;

public class Rectangle extends AShape {

    private int bigLength;
    private int smallLength;

    public Rectangle(int bigLength, int smallLength) {
        this.bigLength = bigLength;
        this.smallLength = smallLength;
    }

    public int getBigLength() {
        return bigLength;
    }

    public int getSmallLength() {
        return smallLength;
    }

    int getArea() {
        return bigLength * smallLength;
    }

    int getPerimeter() {
        return 2 * bigLength + 2 * smallLength;
    }
}
