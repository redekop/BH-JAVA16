package com.belhard.homeworks.hw1;

import java.util.Arrays;

public class HomeWork1 {

  public static void main(String[] args) {

    /*first task--------------------------------------*/
    int a = 0;
    int b = 6;

    System.out.println("1)");
    System.out.println("sum = " + (a + b));
    System.out.println("difference = " + (a - b));
    System.out.println("multiplication = " + (a * b));
    if (b == 0) {
      System.out.println("cannot be divided by zero");
    } else {
      System.out.println("division = " + (double) a / (double) b);
    }


    /*second task-------------------------------------*/
    System.out.println("\n2.1)");
    double temperature = 23;
    if (temperature < 18) {
      System.out.println("Надень свитер!");
    } else {
      System.out.println("Надень майку");
    }

    if (temperature < 10) {
      System.out.println("Надень шапку!");
    } else if (temperature >= 10 && temperature < 18) {
      System.out.println("Надень куртку");
    } else if (temperature >= 18 && temperature < 25) {
      System.out.println("Надень свитер!");
    } else {
      System.out.println("Иди на пляж, какая там работа!");
    }

    /*third task--------------------------------------*/
    System.out.println("\n3)");
    int min;
    int max;
    int salary1 = 1000, salary2 = 500, salary3 = 1200;

    int[] mas = {salary1, salary2, salary3};
    Arrays.sort(mas);
    System.out.println("Sorting values: ");
    for (int i = 0; i < mas.length; i++) {
      min = mas[0];
      System.out.println(i);
    }
    System.out.println("Salary difference is " + (mas[2] - mas[0]));


    /*fourth task-------------------------------------*/
    System.out.println("\n4)");
    int a1 = 3;
    int n = 2;
    System.out.printf("Результат возведения числа %d в степень %d равна %d", a1, n, (int) Math.pow(a1, n));


    /*fifth task--------------------------------------*/
    System.out.println("\n5)");
    double sum = 80;
    double proc = 6;
    int years = 3;

    double result = sum + (sum * proc * years) / 100;
    System.out.printf("Сумма вклада %.2f под процент %.2f по прошествии %d лет будет равна %.2f", sum, proc, years, result);



    /*sixth task--------------------------------------*/
    System.out.println("\n6)");
    System.out.println("Числа из интервала от 1 до 100, которые делятся без остатка одновременно на 3 и на 7");
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 7 == 0) {
        System.out.print(i);
      }
    }

    System.out.println("Числа из интервала от 1 до 100, которые делятся без остатка либо на 3, либо на 5, но не одновременно на 3 и 5");
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        if (!(i % 3 == 0 && i % 5 == 0)) {
          System.out.print(i + " ");
        }
      }
    }


  }
}







