package com.belhard.homeworks.hw2.Task3;

public class Main {

  public static void main(String[] args) {

    Car car = new Car("Машина");
    car.setX(2.0).setY(1.0);
    car.goCar();

    System.out.println("Point is " + car.getPoint());
    System.out.println("Distance is " + car.distanceToNewPoint(0.0, 1.0) + ", new Point is " + car.getPoint() + "\n");


    Car car1 = new Car("Машинка");
    car1.setGas(50.0);
    car1.goCar();
  }
}
