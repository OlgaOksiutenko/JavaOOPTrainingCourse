package com.tyshchenko.training.java.oop.lesson4.comparison;

/**
 * @author Alexander Tyshchenko.
 */
public class Human implements Comparable<Human>{

    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Human human) {
        if (age > human.getAge()) return -1;
        else if (age == human.getAge()) return 0;
        else if (age < human.getAge()) return 1;
        else
            return 0;
    }
    }

