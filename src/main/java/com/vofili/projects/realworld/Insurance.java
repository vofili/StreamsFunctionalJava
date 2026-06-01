package com.vofili.projects.realworld;

public class Insurance {
    String name;

    public Insurance() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "name='" + name + '\'' +
                '}';
    }
}
