package com.sda.oop;

public interface IColor {

    //constante
    String NAME = "Some name";

    String getColor();

    default long getCode() {
        return 1L;
    }
}
