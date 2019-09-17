package com.belhard.homeworks.hw3;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

  public static void main(String[] args) {

    String input = "ab,, a.aaA B";
    Map<Character, Integer> map = new HashMap<>();

    char[] chars = input.toLowerCase()
            .replaceAll("\\W", "'")
            .toCharArray();

    for (Character c : chars) {
/*      if (!Character.isLetter(c) && Character.isSpaceChar(c)) {
        c = '\'';
      }*/


      if (!map.containsKey(c)) {
        map.put(c, 1);
      } else {
        map.put(c, map.get(c) + 1);
      }
    }

    for (Map.Entry<Character, Integer> e : map.entrySet()) {
      System.out.printf("%s : %d\n", e.getKey(), e.getValue());
    }
    System.out.println(map);
  }
}
