package com.tyshchenko.training.java.oop.lesson5.io.file;

import com.tyshchenko.training.java.oop.lesson3.polymorphism.Developer;
import com.tyshchenko.training.java.oop.util.Constants;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ol on 31.05.2015.
 */
public class FileDataCopy {

    public static void main(String[] args) {

        File file = new File(Constants.FILE_PATH_LESSON_5);
        StringBuilder sb = new StringBuilder();
        for (File fileItem : file.listFiles()) {
            sb.append("FileName: " + fileItem.getName() + "| ")
              .append("FilePath: " + fileItem.getPath() + "| ")
                    .append("FileDate: " + new Date(file.lastModified()).toString() + "| " )
            .append("\n");

        }
        System.out.println(sb.toString());

        File newFile = new File(Constants.FILE_PATH_HOMEWORK_05+"/"+"FileDataCopy.txt");
        // if file doesnt exists, then create it
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter fw = new FileWriter(newFile);
            fw.write(sb.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
