package com.belhard.homeworks.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedMap;

public class Task2 {

  public static void main(String[] args) {

    StringBuilder result = new StringBuilder();

    List<String> list = new ArrayList<String>() {{
      add("Мама");
      add("мыла");
      add("раму");
      add("!");
    }};

    for (int i = 0; i < list.size(); i++) {
      result.append(list.get(i));
      if (i < list.size() - 2) {
        result.append(" ");
      }
    }

    System.out.println(result);
    System.out.println(result.toString().toUpperCase());


  }
}
