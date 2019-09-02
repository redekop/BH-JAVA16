package com.belhard.homeworks.hw2.Task2;

public class EventTime {

  private String startTime;
  private String endTime;

  public EventTime(String startTime, String endTime) {
    this.startTime = startTime;
    this.endTime = endTime;
  }


  public String getStartTime() {
    return startTime;
  }

  public String getEndTime() {
    return endTime;
  }



  @Override
  public String toString() {
    return "EventTime{" +
            "startTime='" + startTime + '\'' +
            ", endTime='" + endTime + '\'' +
            '}';
  }
}
