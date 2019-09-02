package com.belhard.homeworks.hw2.Task2;

public class Main {

  public static void main(String[] args) {

    /*Составляем список мероприятий, на конкретные даты*/

    System.out.println("Create first event list");
    EventDate event1 = new EventDate(3, 9, 2019, TypeEvent.DANCE);
    EventDate event2 = new EventDate(4, 9, 2019, TypeEvent.JAVA_LESSON);
    EventDate event3 = new EventDate(4, 9, 2019, TypeEvent.JAVA_LESSON);
    EventDate event4 = new EventDate(5, 9, 2019, TypeEvent.ENCLISH_LESSON);
    EventDate event5 = new EventDate(0, 0, 2019, TypeEvent.ENCLISH_LESSON);

    EventsList eventsList = new EventsList();
    eventsList.fill(event1.getEventNote());
    eventsList.fill(event2.getEventNote());
    eventsList.fill(event3.getEventNote());
    eventsList.fill(event4.getEventNote());
    eventsList.fill(event5.getEventNote());
    eventsList.getList();


    System.out.println("\nModified first event list");
    eventsList.changeEvent(event1.getEventNote(), event1.getEvent(), TypeEvent.SLIP);
    eventsList.changeEvent(event2.getEventNote(), event2.getEvent(), TypeEvent.WORK);
    eventsList.changeEvent(event4.getEventNote(), event4.getEvent(), TypeEvent.SLIP);
    eventsList.changeEvent(event5.getEventNote(), event5.getEvent(), TypeEvent.WORK);
    eventsList.getList();

    System.out.println("\nCreate second event list");
    EventDate event2_1 = new EventDate(30, 9, 2019, TypeEvent.DANCE, new EventTime("18:00", "20:00"));
    EventDate event2_2 = new EventDate(18, 10, 2019, TypeEvent.WORK, new EventTime("18:00", "20:00"));

    EventsList eventsList2 = new EventsList();
    eventsList2.fill(event2_1.getEventNote());
    eventsList2.fill(event2_2.getEventNote());
    eventsList2.getList();


  }
}
