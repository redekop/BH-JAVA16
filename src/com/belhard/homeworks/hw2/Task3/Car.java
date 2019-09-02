package com.belhard.homeworks.hw2.Task3;

import java.util.Arrays;

public class Car {

  private String name;
  private double x;
  private double y;
  private double gas;
  double[] point;

  public Car(String name) {
    this.name = name;
  }

  public Car(String name, double x, double y) {
    this(name);
    this.y = y;
    this.x = x;
  }

  public String getPoint() {
    point = new double[]{this.x, this.y};
    return Arrays.toString(point);
  }

  public double distanceToNewPoint(double x, double y) {
    double arg1 = Math.pow((x - this.x), 2);
    double arg2 = Math.pow((y - this.y), 2);
    double distance = Math.sqrt(arg1 + arg2);
    this.x = x;
    this.y = y;
    return distance;
  }

  public void goCar() {
    //Из расчета - на 100 км расходуется 10л бензина
    double a = 10.0/100.0; //расход на 1 км
    if (gas == 0.0) {
      System.out.println("Refuel the car!");
    } else {
      double b = this.gas/a;
      System.out.println("You will drive only " + b + " km");
    }
  }


  public Car setX(double x) {
    this.x = x;
    return this;
  }

  public Car setY(double y) {
    this.y = y;
    return this;
  }

  public void setGas(double gas) {
    this.gas = gas;
  }

  @Override
  public String toString() {
    return "Car{" +
            "name='" + name + '\'' +
            ", x=" + x +
            ", y=" + y +
            '}';
  }
}
