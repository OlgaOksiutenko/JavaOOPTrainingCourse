package com.tyshchenko.training.java.oop.lesson3.exceptions.checked;

import com.tyshchenko.training.java.oop.util.Constants;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Alexander Tyshchenko.
 */
public class TryCatchWithResources {

    private static final String filePath = Constants.FILE_PATH_LESSON_3 + "TryWithResourcesExplanation.txt";

    private static void printFile() throws IOException {
        InputStream input = null;
        BufferedInputStream bufferedInput = null;

        try {
            input = new FileInputStream(filePath);
            bufferedInput = new BufferedInputStream(input);

            int data;

            do {
                data = bufferedInput.read();
                System.out.print((char) data);
            }
            while(data != -1);
            System.out.println();
        } finally {
            if (bufferedInput != null) {
                try {
                    bufferedInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void printFileJava7() {

        try(FileInputStream input = new FileInputStream(filePath);
            BufferedInputStream bufferedInput = new BufferedInputStream(input)) {

            int data;

            do {
                data = bufferedInput.read();
                System.out.print((char) data);
            }
            while(data != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            printFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------");
        printFileJava7();
    }

}
