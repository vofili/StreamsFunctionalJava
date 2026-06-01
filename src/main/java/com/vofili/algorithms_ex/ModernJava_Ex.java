package com.vofili.algorithms_ex;

import java.util.*;
import java.util.function.*;

import static com.vofili.Helpers.*;


public class ModernJava_Ex {

    //Sort Function for Apples
    public void sortApples(List <Apple> inventory){

        Collections.sort(inventory, new Comparator<Apple>(){
            public int compare(Apple apple1,Apple apple2){
                return apple1.getWeight().compareTo(apple2.getWeight());
            }
        });

    }

    //Filter Function for Apple
    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple>result=new ArrayList<Apple>();
        for(Apple item:inventory){
            if(item.getWeight() > 55){
                result.add(item);
            }
        }
        return result;
    }

    static List<Apple> filterColor(List<Apple> inventory,Color color){
        List<Apple> result = new ArrayList<Apple>();
        for(Apple item :inventory) {
            if (item.getColor().equals(color)) {
                result.add(item);
            }
        }
            return result;

    }



    public static void main(String[] args) {

        Apple a1,a2,a3,a4,a5;
        a1 = new Apple(Color.GREEN,45);a2=new Apple(Color.YELLOW,76); a3 = new Apple(Color.GREEN,87);
        a4 = new Apple(Color.RED,85); a5 = new Apple(Color.PALE,12);


        List<Apple> basket = new ArrayList<Apple>();
        basket.add(a1);basket.add(a2);basket.add(a3);basket.add(a4);basket.add(a5);
       var colortype = Color.GREEN;
       printt("Filter Apple Basket for "+colortype+" Apples");
       List<Apple> greenBasket = filterColor(basket,colortype);
       for(Apple item:greenBasket){
           printt(item.toString());
       }
        printt(" ");
        printt("Filter Apple Basket Heavy 55kg Apples");
        List<Apple> hvyBasket = filterHeavyApples(basket);
        for(Apple item:hvyBasket){
            printt(item.toString());
        }

//        System.out.printf("Greetings '%20.5s'%n","Valentine");
//        System.out.printf("%c%n",'l');
//        System.out.printf("%5.2f%n",3.14892);
//        System.out.printf(Locale.ITALY,"%,d %n",3250894);
//        System.out.printf(Locale.US,"%,d %n",3250894);
    }
}
