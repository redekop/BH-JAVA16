package com.belhard.homeworks.hw4.Task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Basket {


  public double fillBasket(List<AbstractProduct> list) {
    return list.stream()
            .map(AbstractProduct::getCost)
            .mapToDouble(s -> Double.parseDouble(s.toString())).sum();
  }

}
