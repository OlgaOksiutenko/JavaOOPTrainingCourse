package com.tyshchenko.training.java.oop.lesson2.figures;

/**
 * Created by ol on 17.05.2015.
 */
public class Rectangle extends Figure {

    public double a;
    public double b;
    public double S;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public void countSquere() {
     S = a*b;
        System.out.println("Squere of Rectangle = "+ S);
    }
}
