package com.belhard.lessons.lesson6.entities;

import java.util.Objects;

public abstract class Person {

  private String name;
  private int age;
  private double weight;
  private String education;

  public Person(String name, int age, double weight, String education) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.education = education;
  }

  public Person(Person another) {
    this(another.getName(), another.getAge(), another.getWeight(), another.getEducation());
  }


//  public void doWork() {
//    System.out.println("do nothing");
//  }




  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", weight=" + weight +
            ", education='" + education + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age &&
            Double.compare(person.weight, weight) == 0 &&
            Objects.equals(name, person.name) &&
            Objects.equals(education, person.education);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, weight, education);
  }
}
