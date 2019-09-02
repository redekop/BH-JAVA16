package com.belhard.lessons.lesson4;

public class Main {

  public static void main(String[] args) {

    Country country1 = new Country("Belarus", 123456);
    Person person1 = new Person("Vasily", 30, country1);


    person1.walk();
    person1.eat("meat");
    System.out.println(person1.growOld());


    System.out.println(person1.toString());


  }
}
