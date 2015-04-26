package com.tyshchenko.training.java.oop.lesson1;

/**
 * @author Alexander Tyshchenko.
 */
public class StaticBlock {

    static  {
        System.out.println("static block");
    }

    {
        System.out.println("standard block");
    }

    public static void main(String[] args) {
        StaticBlock block1 = new StaticBlock();
        StaticBlock block2 = new StaticBlock();
    }

}
