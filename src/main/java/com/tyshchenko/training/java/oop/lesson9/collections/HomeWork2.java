package com.tyshchenko.training.java.oop.lesson9.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ol on 11.06.2015.
 */
public class HomeWork2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("w");
        list.add("a");
        list.add("h");
        list.add("t");
        list.add("m");
        list.add("u");
        System.out.println("List_1 " + list);

        list.remove(5);
        list.subList(0,1).clear();

        System.out.println("New List "+ list);

    }

}
