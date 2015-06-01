package com.tyshchenko.training.java.oop.lesson5.io.file;

import com.tyshchenko.training.java.oop.util.Constants;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * Created by ol on 31.05.2015.
 */
public class DirectoryCopy  {

    public static void main(String[] args) {

        String dirName = Constants.FILE_PATH_LESSON_5;
        File file = new File(dirName);

        for(File fileItem : file.listFiles()){
            String destinationFilePath = Constants.FILE_PATH_HOMEWORK_05 + "/" + fileItem.getName();
            try {
                Files.copy(fileItem.toPath(),
                        (new File(destinationFilePath)).toPath(),
                        StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
