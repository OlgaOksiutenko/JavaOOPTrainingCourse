package com.tyshchenko.training.java.oop.lesson3;

/**
 * @author Alexander Tyshchenko.
 */
public class InstanceOfExample3 {

    public static void main(String[] args) {
        Object obj1 = new Child();
        Object obj2 = new Parent();

        System.out.println(obj1 instanceof Parent);
        System.out.println(obj2 instanceof Parent);
    }

    static class SuperParent {}

    static class Parent extends SuperParent {}

    static class Child extends Parent {}

}