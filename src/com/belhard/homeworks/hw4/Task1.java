package com.belhard.homeworks.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

  /*Есть список строк. Создать одну строку, состоящую из элементов списка, длина которых менее 5 символов, через пробел,
  и вывести ее на консоль. (List<String>, StringBuilder)
  Пример: список строк {“aaa”, “bbb”, “qwerty”, “”, “.”,”abcde”,“ccc”} => Вывод: “aaa bbb  . ccc”*/

  public static void main(String[] args) {

    List<String> list = new ArrayList<String>() {{
      add("aaa");
      add("bbb");
      add("qwerty");
      add("");
      add(".");
      add("abcde");
      add("ccc");
    }};
    System.out.println(list.stream().filter(i -> i.length() < 5).collect(Collectors.joining(" ")));
  }
}
