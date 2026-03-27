package com.vofili.algorithms_ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ModernJava_Ex {


    public void sortApples(List <Apple> inventory){

        Collections.sort(inventory, new Comparator<Apple>(){
            public int compare(Apple apple1,Apple apple2){
                return apple1.getWeight().compareTo(apple2.getWeight());
            }
        });




    }
    public static void main(String[] args) {

        Apple a1,a2,a3,a4,a5;
        a1 = new Apple();a2=new Apple(); a3 = new Apple(); a4 = new Apple(); a5 = new Apple();
        a1.setWeight(70);
        a2.setWeight(45);
        a3.setWeight(80);
        a4.setWeight(76);
        a5.setWeight(35);

        List<Apple> basket = new ArrayList<Apple>();
        basket.add(a1);basket.add(a2);basket.add(a3);basket.add(a4);basket.add(a5);

        for(var n:basket){
            System.out.println("Basket item - N "+n);
        }
        ModernJava_Ex mex = new ModernJava_Ex();
        mex.sortApples(basket);

        for(var x: basket){
            System.out.println("Basket Item N "+x);
        }
    }
}
