package com.tyshchenko.training.java.oop.lesson9.collections;

import com.tyshchenko.training.java.oop.util.Constants;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by ol on 11.06.2015.
 */
public class HomeWork4 {
    public static void main(String[] args) {

        String dirName = Constants.FILE_PATH_LESSON_5;
        File file = new File(dirName);
        String fileList[] = file.list();
        List<String> list1 = new ArrayList<>(fileList.length);

        for (String s : fileList ){
            list1.add(s);
        }
        ListIterator<String> listIterator = list1.listIterator();

        int i=0;
        while(listIterator.hasNext() && i!=5) {
            System.out.println(listIterator.next());
            i++;
        }

    }
}
