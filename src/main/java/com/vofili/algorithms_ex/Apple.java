package com.vofili.algorithms_ex;

public class Apple {

    String color;
    Integer weight;


    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple() {
        this.color="Green";
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
