package com.vofili;


import java.time.LocalDate;
import java.time.LocalTime;
public class Helpers {

    static LocalDate dateNow = LocalDate.now();
    static LocalTime timeNow = LocalTime.now();


    public static void print(Object x){
        System.out.printf(dateNow.toString()+ " %s%n ",x);
    }

    public static void printt(String x){

        System.out.printf(dateNow.toString()+" "+timeNow.toString()+" %s%n ",x);
    }

    public static void main(String[] args) {
        print("Hello");
    }
}
