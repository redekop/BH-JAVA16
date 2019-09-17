package com.belhard.lessons.lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();


    try {
      FileReader fileReader = new FileReader("text");
      while (fileReader.ready()) {
        int read = fileReader.read();
        list.add(read + 1);
      }

    } catch (java.io.IOException e) {
      e.printStackTrace();
    }




    try {
      FileWriter fileWriter = new FileWriter("text");
      for (Integer i : list) {
        fileWriter.write(i);
      }
      fileWriter.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
