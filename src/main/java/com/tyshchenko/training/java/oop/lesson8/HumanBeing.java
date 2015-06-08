package com.tyshchenko.training.java.oop.lesson8;

import com.tyshchenko.training.java.oop.util.Constants;

import java.io.*;

/**
 * Created by ol on 07.06.2015.
 */
public class HumanBeing implements Serializable, Cloneable{

  String name;
    int age;
    double hight;
    double weight;

    public HumanBeing(String name, double weight, double hight, int age) {
        this.name = name;
        this.weight = weight;
        this.hight = hight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "HumanBeing{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hight=" + hight +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        HumanBeing humanBeing = new HumanBeing("Jack", 67.5, 1.88, 25);
        System.out.println(humanBeing.toString());
        HumanBeing humanBeing1 = (HumanBeing) humanBeing.clone();
        if(humanBeing.equals(humanBeing1)){
            System.out.println("human1 equals human2");
        }
        else{
            System.out.println("humans are different");
        }
        System.out.println("hash is "+humanBeing.hashCode());

       //serializable

          try (OutputStream fos = new FileOutputStream(Constants.FILE_PATH_LESSON_8 + "/temp_homework.out");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(humanBeing);
            System.out.println(humanBeing);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HumanBeing humanBeing3;
        try (InputStream fis = new FileInputStream(Constants.FILE_PATH_LESSON_8 + "/temp_homework.out");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            humanBeing3 = (HumanBeing) ois.readObject();
            System.out.println(humanBeing3);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
