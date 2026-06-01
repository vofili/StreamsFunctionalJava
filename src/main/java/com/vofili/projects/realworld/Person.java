package com.vofili.projects.realworld;

import java.util.Objects;

public class Person {

    String name;
    Car car;
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){

        if(obj.getClass() != this.getClass() || obj ==null) return false;
        if(obj == this) return true;
        Person person = (Person) obj;
        return this.name ==  person.name;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
