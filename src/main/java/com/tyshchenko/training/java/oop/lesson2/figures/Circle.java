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
        countSquere();
    }

    @Override
    public double countSquere() {
      S = pi*r*r;
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
