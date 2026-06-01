package com.vofili.projects;

public class DebugDemo {


    static String returnGreeting(String msg){
        return "Hey there!, "+msg;
    }
    public static void main(String[] args){

        String greeting = "Hello World";
        System.out.println(returnGreeting(greeting));

        Integer number=3;
        Integer result = doubleInt(number);
        System.out.println("The Doubled Value of "+number+" Number is: "+result);
    }

    public static Integer doubleInt(Integer num){
        return num * 2;
    }
}
