package com.vofili.algorithms_ex;

public class Algorithms {


    public static void printRecurr(int x){
        if(x > 0){
            printRecurr(x-1);
        }
      System.out.println(x);
    }

    public static void main(String[] args){
        printRecurr(10);
    }
}
