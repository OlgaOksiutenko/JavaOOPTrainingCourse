package com.tyshchenko.training.java.oop.lesson3.exceptions;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.tyshchenko.training.java.oop.lesson9.collections.ArrayListExample1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ol on 26.05.2015.
 */
public class CustomURL {

    static String url = "hl=uk&tab=wT";


    public static void main(String[] args) {

        String[] keyValuelist = url.split("&");
        System.out.println("New array " + keyValuelist.toString());
        Map<String, String> map = new HashMap<>();

        for (String item: keyValuelist){
            String[] k= item.split("=");
            if (k.length !=2) throw new WrongFormatURLException("wrong url format");
            map.put(k[0],k[1]);
            System.out.println("Elements for url are     " + k[0] + "    " + k[1]);
        }

    }
}
