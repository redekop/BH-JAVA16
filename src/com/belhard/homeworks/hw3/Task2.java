package com.belhard.homeworks.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedMap;

public class Task2 {

  public static void main(String[] args) {


    String result = "";

    ArrayList<String> list = new ArrayList<String>() {{
      add("Мама");
      add("мыла");
      add("раму");
      add("!");
    }};

    for (String i : list) {
      result += i + " ";
    }

//    ListIterator listIterator = list.listIterator();
//    while (listIterator.hasNext()) {
//      result += (String) listIterator.next() + " ";
//    }

    System.out.println(result);
    System.out.println(result.toUpperCase());


  }
}
