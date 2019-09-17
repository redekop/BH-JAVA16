package com.belhard.lessons;

import java.awt.print.Printable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

  interface Operationable{
    int calculate(int x, int y);
  }

  public static void main(String[] args) {
    Function function;
    Consumer consumer;
    Predicate predicate;

    Operationable operation;
    operation = (x,y)->x+y;

    int result = operation.calculate(10, 20);
    System.out.println(result); //30



    Operationable op = new Operationable() {
      @Override
      public int calculate(int x, int y) {
        return x+y;
      }
    };

    int z = op.calculate(20, 10);
    System.out.println(z); // 30


  }
}


