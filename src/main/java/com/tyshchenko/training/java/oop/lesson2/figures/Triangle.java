package com.tyshchenko.training.java.oop.lesson2.figures;

/**
 * Created by ol on 17.05.2015.
 */
public class Triangle extends Figure {

    public double a;
    public double b;
    public double c;
    public double S;


    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.c = c;
        this.b = b;
        countSquere();
    }

    @Override
    public double countSquere() {
        S = 0;
     if (a==b && a==c){
       S = a*a*Math.sqrt(3)/4;
     }
        else {
         double p = (a+b+c)/2;
         S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

     }
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

