package com.belhard.homeworks.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task1 {

  public static void main(String[] args) {

    int min = -500;
    int max = 500;
    int diff = max - min;
    int sum = 0;
    double average;

    Random random = new Random();

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i <= 4; i++) {
      int j = min + random.nextInt(diff + 1);
      list.add(j);
      sum += j;
    }
    System.out.println(list);

//    ListIterator listIterator = list.listIterator();
//    while (listIterator.hasNext()) {
//      sum += (Integer) listIterator.next();
//    }
    average = (double) sum / list.size();

    System.out.println(sum);
    System.out.println(average);

  }
}
