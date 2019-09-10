package com.belhard.homeworks.hw2;

public class Task1 {

  public static void main(String[] args) {

    int i, j;

    System.out.printf("%4s", "");
    for (i = 1; i < 10; i++) {
      System.out.printf("%4d", i);
    }
    System.out.println();
    for (i = 1; i < 10; i++) {
      System.out.printf("%4d", i);
      for (j = 1; j < 10; j++)
        System.out.printf("%4d", i * j);
      System.out.println();
    }

  }

}