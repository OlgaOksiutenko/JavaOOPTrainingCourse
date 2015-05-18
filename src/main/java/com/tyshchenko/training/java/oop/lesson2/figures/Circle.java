package com.tyshchenko.training.java.oop.lesson2.figures;

/**
 * Created by ol on 17.05.2015.
 */
public class Circle extends Figure {
    public double r;
    public double S;
    public static final double pi=3.14;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public void countSquere() {
      S = pi*r*r;
        System.out.println("Squere of Circle = "+S);
    }
}
