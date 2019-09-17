package com.belhard.homeworks.hw3.Task4;

public class Person {

  private PlayablePer pet;

  public Person(PlayablePer pet) {
    this.pet = pet;
  }

  public void playWithPer() {
    pet.play();
  }






  @Override
  public String toString() {
    return "Person{" +
            "pet=" + pet +
            '}';
  }
}
