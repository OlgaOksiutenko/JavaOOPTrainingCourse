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
        countSquere();
    }

    @Override
    public double countSquere() {
     S = a*b;
        return S;
    }

    @Override
    public int compareTo(Figure figure) {
        if (S < figure.countSquere()) return -1;
        else if (S == figure.countSquere()) return 0;
        else if (S > figure.countSquere()) return 1;
        else
            return 0;
    }
}
