package com.vofili.behaviourparameterization;

public class Apple {

    private int id;
    private String name;
    private Color color;
    Float weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Apple(String name, Color color, float weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n Apple{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", weight=" + weight + "}";
    }
}
