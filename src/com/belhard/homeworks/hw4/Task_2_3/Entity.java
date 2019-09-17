package com.belhard.homeworks.hw4.Task_2_3;

import java.util.Objects;

public class Entity {

  private String name;

  public Entity(String name) {
    this.name = name;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public String toString() {
    return "Entity{" +
            "name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Entity entity = (Entity) o;
    return Objects.equals(name, entity.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
