package com.belhard.lessons.lesson6;

import com.belhard.lessons.lesson6.entities.Manager;
import com.belhard.lessons.lesson6.entities.Person;
import com.belhard.lessons.lesson6.entities.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    Person person = new Person("Elizabeth", 15, 45, "base");
//    person.doWork();

    Worker worker = new Worker("Vasiliy", 50, 90, "engineer", 1000);
    System.out.println(worker);
    worker.doWork();
    worker.rest();

    Worker worker1 = new Worker(worker, 1500);
    System.out.println(worker1);

    Manager manager = new Manager("Oleg", 45, 75, "wert", 2500);

    Worker worker2 = new Worker(manager, 1500);
//    super(worker2.doWork());


    List arrayList = new ArrayList();



  }

}
