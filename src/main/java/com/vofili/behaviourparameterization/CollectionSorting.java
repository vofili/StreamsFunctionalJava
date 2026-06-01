package com.vofili.behaviourparameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static com.vofili.Helpers.printt;

public class CollectionSorting {

    public static List sortApples (List<Apple> inventory){

        inventory.sort(new Comparator<Apple>(){
            public int compare(Apple a1, Apple a2){
               return a1.getWeight().compareTo(a2.getWeight());
            }
        });

       return inventory;
    }

    public static List<Apple> sortApplesEx(List<Apple> basket, Comparator<Apple> compare){
         basket.sort(compare);

         return basket;
    }

    public static void main(String[] args) {

        List<Apple> nuBasket = Arrays.asList(new Apple("Spring Apple",Color.RED,67),
                new Apple("Fresh Apple",Color.RED,97),
                new Apple("Adam's Apple",Color.YELLOW,55),
                new Apple("Eve's Apple",Color.BLUE,68),
                new Apple("Jenn's Apple",Color.RED,87),
                new Apple("Boar Apple",Color.RED,45),
                new Apple("Bad Apple",Color.PALE,23));

        sortApplesEx(nuBasket,(Apple a1,Apple a2)-> a1.getWeight().compareTo(a2.getWeight()));

        printt(nuBasket.toString());
    }
}
