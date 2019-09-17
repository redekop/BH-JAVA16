package com.belhard.homeworks.hw4.Task_2_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {

  /*Возьмем класс из предыдущего задания.
Создадим словарь Map<Entity, List<String>> entityMap = … , то есть словарь хранит пары, в которых ключ – объект класса Entity, а значение – список строк.
Запишем в entityMap 5 пар.
например, первая пара [new Entity(“Vasily”) : new ArrayList<>(){{add.(“milk”);add(“bread”);}}]
вторая пара [new Entity(“Ivan”) : new ArrayList<>(){{add.(“bread”); add.(“butter”); add.(“solt”);}}]
… и т.д. Будем считать, что это какие-то люди и список их покупок.
Посчитать, сколько штук каждого продукта всего надо купить.*/



  public static void main(String[] args) {

    Map<Entity, List<String>> entityMap = new HashMap<Entity, List<String>>() {{
      put(new Entity("Vasily"), new ArrayList<String >(){{add("milk");add("bread");}});
      put(new Entity("Ivan"), new ArrayList<String >(){{add("bread");add("butter");add("solt");}});
      put(new Entity("Ignat"), new ArrayList<String >(){{add("bread");}});

    }};

    System.out.println(entityMap.entrySet().stream()
            .collect(Collectors.groupingBy(m -> m.getKey().getName(), Collectors.mapping(m -> m.getValue().size(), Collectors.toList()))));


  }


}
