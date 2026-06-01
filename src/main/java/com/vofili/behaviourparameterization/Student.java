package com.vofili.behaviourparameterization;

import java.time.LocalDate;

public class Student {

    String firstName;
    String lastName;
    LocalDate birthDate;
    Gender gender;
    SubClass subClass;

    public Student() {
    }

    public Student(String firstName, String lastName, LocalDate birthDate, Gender gender, SubClass subClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.subClass = subClass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public SubClass getSubClass() {
        return subClass;
    }

    public void setSubClass(SubClass subClass) {
        this.subClass = subClass;
    }
}
