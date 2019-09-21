package com.belhard.homeworks.hw4.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    List<AbstractProduct> list = new ArrayList<AbstractProduct>(){{
      add(new Product("milk", 2.5));
      add(new Product("haircut", 15.5));
      add(new Product("haircut", 15.5));
      add(new Product("haircut", 15.5));
    }};

    Basket basket = new Basket();
    double sum = basket.fillBasket(list);
    System.out.println(sum);


  }


}
