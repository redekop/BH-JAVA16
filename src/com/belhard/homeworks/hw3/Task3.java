package com.belhard.homeworks.hw3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Task3 {

  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();
    Random random = new Random();

    for (int i = 0; i < 5; i++) {
      set.add(random.nextInt(101) - 50);
    }

    int bound = random.nextInt(101) - 50;

    System.out.println("Bound: " + bound);



    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      Integer next = iterator.next();
      if (next < bound) {
        iterator.remove();
      };
    }

    System.out.println(set);

  }
}
