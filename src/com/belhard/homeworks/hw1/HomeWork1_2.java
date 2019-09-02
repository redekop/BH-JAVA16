package com.belhard.homeworks.hw1;

public class HomeWork1_2 {

  public static void main(String[] args) {

//    int temp1;
//    int temp2;
//
//    boolean isSort = true;
//    int[] mas = {5, 8, 9, 56, 4, 54, 13, 63, 67, 1, 5};
//
//    while (isSort) {
//      isSort = false;
//      for (int i = 0; i < mas.length - 1; i++) {
//
//        if (mas[i] > mas[i + 1]) {
//          temp1 = mas[i];
//          mas[i] = mas[i + 1];
//          mas[i + 1] = temp1;
//          isSort = true;
//        }
//      }
//    }
//
//    System.out.println(Arrays.toString(mas));

    /*third task--------------------------------------*/
    System.out.println("3)Как бы ты нашла минимальное и максимальное число без использования массива и методов Math.min() и Math.max()?");
    int min = 0;
    int max = 0;
    int s1 = 1700, s2 = 500, s3 = 1300;

    if (s1 >= s2 && s1 >= s3) {
      max = s1;
      if (s2 <= s3) {
        min = s2;
      } else {
        min = s3;
      }
    } else if (s2 >= s1 && s2 >= s3) {
      max = s2;
      if (s1 <= s3) {
        min = s1;
      } else {
        min = s3;
      }
    } else if (s3 >= s1 && s3 >= s2) {
      max = s3;
      if (s1 <= s2) {
        min = s1;
      } else {
        min = s2;
      }
    }
    System.out.println("Salary difference is " + (max - min));




    /*fifth task--------------------------------------*/
    System.out.println("\n5)обычно каждый год происходит индексация суммы, " +
            "от которой рассчитывается процент. То есть если было 1000, процент = 10%, " +
            "то после первого года будет 1100,\n" +
            "после второго – 1100*1.1 = 1210, 3го – 1331 и т.д");

    double sum = 1000;
    double proc = 10;
    int years = 3;

    for (int i = 1; i <= years; i++) {
      double res = sum + (sum * proc) / 100;
      sum = res;
    }
    System.out.println("Сумма будет равна " + sum);


    for (int i = 1; i <= 100; i++) {
      if (i / 10 % 2 == 1) {
        if (i % 3 == 0 ^ i % 5 == 0) {
          System.out.print(i + "");
        }
      }
    }

  }
}
