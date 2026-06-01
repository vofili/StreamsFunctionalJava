package com.vofili.behaviourparameterization;


import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;

import static com.vofili.Helpers.printt;

public class AppleOperations {


    public static void prettyPrintApple(List<Apple> inventory, ApplePrintInterface <Apple> printAction){
            for(Apple a: inventory){
                printAction.printOut(a);
            }
    }

    public static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<Apple>();
        for(Apple item:inventory){
            if(p.test(item)){
                result.add(item);
            }
        }
        return result;
    }


    public static void main(String[] args) {


        List<Apple> appleBasket = Arrays.asList(
                new Apple("Adams Apple",Color.RED,45),
                new Apple("Eve's Apple",Color.GREEN,70),
                new Apple("Emma's Apple",Color.PINK,30),
                new Apple("Spring Apple",Color.YELLOW,59));

        prettyPrintApple(appleBasket,new ApplePrintColor());
        prettyPrintApple(appleBasket,new ApplePrintWeight());


      List<Apple> hvyBasket =  filterApple(appleBasket,(Apple a)-> a.getWeight() > 30);
      printt(hvyBasket.toString());
    }


}



