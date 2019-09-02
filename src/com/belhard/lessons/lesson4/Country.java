package com.belhard.lessons.lesson4;

public class Country {

  private String title;
  private int zipCode;

  public Country(String title, int zipCode) {
    this.title = title;
    this.zipCode = zipCode;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getZipCode() {
    return this.zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return "Country{" +
            "title='" + title + '\'' +
            ", zipCode=" + zipCode +
            '}';
  }
}
