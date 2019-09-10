package com.belhard.homeworks.hw2.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EventDate {

  private int year;
  private int month;
  private int day;
  private Enum event;
  private EventTime time;
  private LocalDate date;

  public EventDate(int day, int month, int year, Enum event) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.event = event;

    if (this.day == 0) {
      this.day++;
    }
    if (this.month == 0) {
      this.month++;
    }
    //дополнить валидацию полей!!!
  }

  public EventDate(int day, int month, int year, Enum event, EventTime time) {
    this(day, month, year, event);
    this.time = time;
  }




  public String getEventNote() {
    this.date = LocalDate.of(year, month, day);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy-E");
    String note = this.date.format(formatter) + getEventTime() + "Событе: " + this.event;
    return note;
  }

  private String getEventTime() {
    try {
      return " " + time.getStartTime() + "-" + time.getEndTime() + " ";
    } catch (NullPointerException ex) {
      return " ";
    }
  }


  public Enum getEvent() {
    return event;
  }


  @Override
  public String toString() {
    return "EventDate{" +
            "year=" + year +
            ", month=" + month +
            ", day=" + day +
            ", event=" + event +
            ", time=" + time +
            ", date=" + date +
            '}';
  }
}



