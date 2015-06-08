package com.tyshchenko.training.java.oop.lesson5.io.file;

import com.tyshchenko.training.java.oop.util.Constants;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

/**
 * Created by ol on 31.05.2015.
 */
public class SequenceInputStreamExHomeWork {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(Constants.FILE_PATH_HOMEWORK_05);

        String[] list = file.list();

        ArrayList<String> files = new ArrayList<>();

        for (File fileItem : file.listFiles() ) {

      //     FileInputStream fin = new FileInputStream(fileItem.createNewFile());
        }
/*

        FileInputStream f
        }
        FileinputStream fin1=new FileinputStream("f1.txt");
        FileinputStream fin2=new FileinputStream("f2.txt");

        FileOutputStream fout=new FileOutputStream("f3.txt");

        SequenceinputStream sis=new SequenceinputStream(fin1,fin2);
        int i;
        while((i.sisread())!=-1)
        {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin.close();
        fin.close();
*/

    }
}




