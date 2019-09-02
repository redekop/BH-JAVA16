package com.belhard.homeworks.hw2.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class EventsList {

  private ArrayList<String> list = new ArrayList<>();


  public void fill(String param) {
    if(!list.contains(param)) {
      list.add(param);
    }
  }

  public void changeEvent(String note, Enum currentTypeEvent, Enum newTypeEvent) {
    ListIterator<String> listIterator = list.listIterator();
    while (listIterator.hasNext()) {
      String next = listIterator.next();
      if(next.contains(note)) {
        listIterator.set(note.replaceAll(currentTypeEvent.toString(), newTypeEvent.toString()));
      }
    }
  }


  public void getList() {
    for (String i : list) {
      System.out.println(i);
    }
  }


}
