package com.tyshchenko.training.java.oop.lesson2.figures;

/**
 * Created by ol on 17.05.2015.
 */
public abstract class Figure implements Comparable<Figure> {

    private String name;
    private double side;
    private double S;

public Figure(String name){}

    public abstract double countSquere();


}
