package com.belhard.lessons.lesson6.entities;

public class Manager extends Person implements Worcable {


  private int salary;

  public Manager(String name, int age, double weight, String education, int salary) {
    super(name, age, weight, education);
    this.salary = salary;
  }


  @Override
  public void doWork() {
    System.out.println("do control");
  }
}
