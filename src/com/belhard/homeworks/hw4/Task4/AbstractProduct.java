package com.belhard.homeworks.hw4.Task4;

public class AbstractProduct {

  private String name;
  private double cost;

  public AbstractProduct(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }


  @Override
  public String toString() {
    return "AbstractProduct{" +
            "name='" + name + '\'' +
            ", cost=" + cost +
            '}';
  }
}
