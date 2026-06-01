package com.vofili.projects.realworld;

import java.util.*;

import static com.vofili.Helpers.print;
import static com.vofili.Helpers.printt;

public class MainEx {

    //List Iteration
    public static List listCreation(Integer noOfelements){
        List<String> result;
        result = List.of("Abel","Enoch","Eagle","Germaine","Freddy","Gravel","Charlie");


        return result;
    }

    public static List createGenericArrayList(){
        List<String> res = new ArrayList();
        res.add("Element 1");
        res.add("Element 2");
        res.add("Element 3");
        res.add("Element 4");
        res.add("Element 5");
        res.add("Element 6");

        return res;
    }

    public static List<String> createStringArrayAsList(){
        List<String> res = Arrays.asList("Str 1","Str 2","Str 3","Str 4","Str 5");
        return res;
    }


    public static void main(String[] args) {


        List<String> inventory = listCreation(7);

        List<String> elemList = createGenericArrayList();
        elemList.add("Element 1");
        elemList.forEach((var item)-> printt(item));
        printt(elemList.toString());
        elemList.remove(5);
        printt(elemList.toString());
        //        var arraysList = createArrayList();
        //        arraysList.forEach((var e)-> printt(e));
        printt("*********** SET *********");

        Set<String> elemSet = new HashSet<String>();
        elemSet.forEach((var e)-> printt(e));
        //        for(String item: inventory){
        //            printt(item);
        //        }
        Person pers1 = new Person("andrew");
        Person pers2 = new Person("andrew");


        //Person pers3 = pers1;

        print("Person 1 == Person 2 "+ (pers2 == pers1));

        print("Person 1 equals Person 2 "+ pers1.equals(pers2));

        Student std1 = new Student(1,"Daniel","Levy");
        Student std2 = new Student(1,"Daniel","Levy");

        print("Student 1 == Student 2 "+ (std1 == std2));
        print("Student 1 equals Student 2 "+ (std1.equals(std2)));
       // print("Person 1 and Person 3 "+(pers3 == pers1));


        Set<Student> stdSet = new HashSet<>();
        stdSet.add(std1);
        stdSet.add(std2);

        print("Student HashSet Size"+stdSet.size());
        print(stdSet.remove(std1));
        print("Student HashSet Size"+stdSet.size());
    }
}
