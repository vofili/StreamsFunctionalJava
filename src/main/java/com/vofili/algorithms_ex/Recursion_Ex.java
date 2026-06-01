package com.vofili.algorithms_ex;

public class Recursion_Ex {





    static void printNumV1(int x){
        if(x > 1){
            printNumV1(x-1);
        }else{
            System.out.println(x);
            return;
        }
    }

    static void printNumV2(int i){

        if(i > 1){
            printNumV2(i-1);


        }
            System.out.println(i);
            return;

    }

    static void printOrderRec(int x){
        if (x > 3){
            return;
        }
        System.out.println(x);
        printOrderRec(x+1);
        System.out.println("End of Call where x:"+x);
        return;
    }
    public static void main(String[] args) {

    }
}
