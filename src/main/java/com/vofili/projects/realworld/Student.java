package com.vofili.projects.realworld;

import java.util.Objects;

public class Student {
    Integer id;
    String firstName;
    String lastName;

    public Student(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj.getClass() != this.getClass() || obj==null) return false;
        Student student = (Student) obj;
        return Objects.equals(this.firstName+this.lastName,student.firstName+student.lastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName+lastName);
    }
}
