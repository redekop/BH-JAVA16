package com.belhard.lessons.lessons9;

public class Main {

  public static void main(String[] args) {
    Thread thread1 = new Thread(new ThreadExample());
    thread1.start();


    Thread thread2 = new Thread(new ThreadExample());
    thread2.start();
  }
}
