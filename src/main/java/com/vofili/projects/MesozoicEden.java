package com.vofili.projects;

public class MesozoicEden {
static String parkname;
    public static String printGreet(String name){
        String position="Park Manager";

       return("My Name is " +name+" and I want to be a "+position+" in the "+parkname);
    }

    public static void main(String[] args){
        parkname="Mesozoic Eden";
        System.out.println("Welcome to Mesozoic Eden");
        System.out.println(printGreet("Valentine"));
    }
}
