package com.belhard.homeworks.hw5.Task2;

public class AccountHolder {

  private String name;
  private double account;

  public AccountHolder(String name, double account) {
    this.name = name;
    this.account = account;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAccount() {
    return account;
  }

  public void setAccount(double account) {
    this.account = account;
  }


  @Override
  public String toString() {
    return "AccountHolder{" +
            "name='" + name + '\'' +
            ", account=" + account +
            '}';
  }
}
