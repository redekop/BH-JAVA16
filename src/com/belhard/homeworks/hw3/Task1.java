package com.belhard.homeworks.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task1 {

  private static final int countInt = 5;
  private static int min = -500;
  private static int max = 500;
  private static int diff = max - min + 1;
  private static Random random = new Random();

  public static void main(String[] args) {

    int sum = 0;

    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= countInt; i++) {
      int j = min + random.nextInt(diff);
      list.add(j);
      sum += j;
    }

    System.out.println(list);
    System.out.println(sum);
    System.out.println((double) sum / list.size());

  }
}
