package com.belhard.homeworks.hw5.Task1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Parser {

  /*Есть список, содержащий людей и суммы на их счетах (input1.txt).
  Считать эти данные в программу, отсортировать в порядке уменьшения суммы на счету и записать в новый файл
  (Например, output1.txt).*/



  public static File file = new File("input1.txt");
  public static File newFile = new File("newinput1.txt");

  public static void main(String[] args) throws IOException {


    Map<String, Integer> map = Files.lines(file.toPath())
            .collect(toMap(s -> s.split("\\s")[0], s -> Integer.parseInt(s.split("\\s")[1])));


    if (newFile.exists()) {
      newFile.delete();
    } else {
      newFile.createNewFile();
    }

    Files.write(Paths.get("newinput1.txt"),
            () -> map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .<CharSequence>map(e -> e.getKey() + " " + e.getValue())
            .iterator());


//    Map<String, Integer> map = new HashMap<>();
//    String[] line;
//    BufferedReader rdr = new BufferedReader(new FileReader("input1.txt"));
//
//    while (rdr.ready()) {
//      line = rdr.readLine().split(" ");
//      map.put(line[0], Integer.parseInt(line[1]));
//    }
//    rdr.close();
//
//
//    System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()));


  }
}








