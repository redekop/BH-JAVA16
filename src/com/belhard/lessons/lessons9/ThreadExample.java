package com.belhard.lessons.lessons9;

public class ThreadExample implements Runnable {


  @Override
  public void run() {
    try {
      System.out.println(Thread.currentThread().getName());
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
