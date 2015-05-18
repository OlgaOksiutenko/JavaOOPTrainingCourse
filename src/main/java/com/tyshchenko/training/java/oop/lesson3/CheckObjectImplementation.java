package com.tyshchenko.training.java.oop.lesson3;

/**
 * @author Alexander Tyshchenko.
 */
public class CheckObjectImplementation {

    public static void main(String[] args) {
        CharSequence sequence = "sequence";
        System.out.println("string".getClass().equals(String.class));
        System.out.println("string".getClass().equals(CharSequence.class));
        System.out.println(sequence.getClass().equals(CharSequence.class));
    }

}
