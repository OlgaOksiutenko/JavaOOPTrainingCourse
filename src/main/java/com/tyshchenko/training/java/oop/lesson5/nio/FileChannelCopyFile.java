package com.tyshchenko.training.java.oop.lesson5.nio;

import com.tyshchenko.training.java.oop.util.Constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * @author Alexander Tyshchenko.
 */
public class FileChannelCopyFile {

    public static void main(String[] args) {

        File from = new File("src/main/java/com/tyshchenko/training/java/oop/lesson5/nio/FileChannelCopyFile.java");
        File dest = new File(Constants.FILE_PATH_LESSON_5 + "/FileChannelCopyFile.txt");

        try(FileChannel sourceChannel=new FileInputStream(from).getChannel();
            FileChannel destinationChannel=new FileOutputStream(dest).getChannel()) {
            sourceChannel.transferTo(0,sourceChannel.size(),destinationChannel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}