package com.belhard.homeworks.hw4.Task_2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task2 {

  /*Создать POJO-класс с одним полем [например, class Entity {private String name; // конструктор, геттер, сеттер, toString} ]
  Записать в список 5 экземпляров этого класса.
  Создать метод, который принимает String как параметр и возвращает из списка объект Entity, у которого поле name совпадает с переданным параметром.
  Например, public static Entity getByName(String name) {//реализация}*/

  public static List<Entity> list = null;

  public static void main(String[] args) {

    list = new ArrayList<Entity>() {{
      add(new Entity("name1"));
      add(new Entity("name2"));
      add(new Entity("name3"));
      add(new Entity("name4"));
    }};

    System.out.println(getByName("name3"));
  }


  public static Entity getByName(String name) {
    return list.stream().filter(s -> s.getName().equals(name)).findAny().get();
  }

}
