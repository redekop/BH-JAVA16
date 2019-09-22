package com.belhard.homeworks.hw5.Task3;

import java.io.*;

public class Main {
  /*Есть список контактов, состоящий из имени, адреса почты и телефона (input3.txt).
  Записать в выходной файл те же данные в формате “Имя : телефон : email“.*/


  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new FileReader("input3.txt"));
    FileWriter fileWriter = new FileWriter("newinput3.txt");
    String line;
    String field1 = null;
    String field2 = null;
    String field3 = null;

    while ((line = bufferedReader.readLine()) != null) {
      String[] element = line.split("\\s");
      for (String i : element) {
        if(i.contains("+")) {
          field2 = i;
        } else if (i.contains("@")) {
          field3 = i;
        } else {
          field1 = i;
        }
      }

      fileWriter.write(new StringBuilder()
                                .append(field1 + "  ")
                                .append(field2 + "  ")
                                .append(field3)
                                .append("\n")
                                .toString());
      fileWriter.flush();

    }
  }





}
