package com.vofili.streamsapi;

import com.vofili.behaviourparameterization.Gender;
import com.vofili.behaviourparameterization.Student;
import com.vofili.behaviourparameterization.SubClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StreamOps {

    List<Student> students = new ArrayList<Student>();

    List<Student> filterStudentByGender(List<Student> students){
        List<Student> result=students;


        return result;
    }

    List<Student> filterStudentByClass(List<Student> students){
        List<Student> result = students;
        return result;
    }
    public static void main(String[] args) {
        StreamOps streamOps = new StreamOps();
        LocalDate bdate =  LocalDate.of(2000,07,01);
        LocalDate bornDay = LocalDate.of(1994,12,01);
        Student a = new Student("Adewale","Anastasian",bdate, Gender.FEMALE, SubClass.DF);
        Student b = new Student("Brandon","Blaise",bornDay,Gender.MALE,SubClass.MAC);

        streamOps.students.add(a);
        streamOps.students.add(b);
    }
}
