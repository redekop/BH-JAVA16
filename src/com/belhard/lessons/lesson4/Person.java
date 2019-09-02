package com.belhard.lessons.lesson4;

public class Person {

  private String name;
  private int age;
  private Country country;

  public Person() {
  }

  public Person(String name, int age, Country country) {
    this.name = name;
    this.age = age;
    this.country = country;
  }


  public String getName() {
    return name;
  }

  public Country getCountry() {
    return country;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public void walk() {
    System.out.println(this.name + " is walking!");
  }


  public void eat(String dish) {
    System.out.println(this.name + " is eating " + dish + ". Very tasty!");
  }

  public void eat() {
    System.out.println(this.name + " is eating nothing");
  }

  public void eat(String dish, int count) {
    System.out.printf("%s is eating %d of %s\n", name, count, dish);
  }



  public void eat(int time, String dish) {
    System.out.printf("%s is eating %s of %d\n", name, dish, time);
  }


  public int growOld() {
    return ++this.age;
  }


  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", country=" + country +
            '}';
  }
}
