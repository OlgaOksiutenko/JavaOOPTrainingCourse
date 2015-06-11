package com.tyshchenko.training.java.oop.lesson9.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ol on 11.06.2015.
 */
public class HomeWork3 {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add("er");
        list.add(4);
        list.add(4.6);
        list.add(99);
        list.add("we");
        list.add("45");

        System.out.println(list);

        System.out.println("Chosen element is " + getElement(list, 8));

    }
    public static Object getElement(List<Object> list, int index){
        if(index<list.size() && index>=0){
        Object element = list.get(index);
        return element;}
        else {
            System.out.println("Index should be less then array size and more or equals '0'");
        return null;}
    }

   }
