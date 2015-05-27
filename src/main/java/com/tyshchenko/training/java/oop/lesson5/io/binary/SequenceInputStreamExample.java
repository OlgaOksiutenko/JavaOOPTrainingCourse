package com.tyshchenko.training.java.oop.lesson5.io.binary;

import com.tyshchenko.training.java.oop.util.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * @author Alexander Tyshchenko.
 */
public class SequenceInputStreamExample {

    public static void main(String[] args) {
        int c;
        List<String> files = Arrays.asList(
                Constants.FILE_PATH_LESSON_5 + "/file1.txt",
                Constants.FILE_PATH_LESSON_5 + "/file2.txt",
                Constants.FILE_PATH_LESSON_5 + "/file3.txt"
        );

        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try {
            while ((c = input.read()) != -1)
                System.out.print((char) c);
        } catch(NullPointerException e) {
            System.out.println("Error Opening File.");
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                input.close();
            } catch(IOException e) {
                System.out.println("Error Closing SequenceInputStream");
            }
        }
    }


    private static class InputStreamEnumerator implements Enumeration<FileInputStream> {
        private Iterator<String> iterator;

        public InputStreamEnumerator(List<String> files) {
            this.iterator = files.iterator();
        }

        public boolean hasMoreElements() {
            return iterator.hasNext();
        }

        public FileInputStream nextElement() {
            try {
                return new FileInputStream(iterator.next().toString());
            } catch (IOException e) {
                return null;
            }
        }
    }
}
