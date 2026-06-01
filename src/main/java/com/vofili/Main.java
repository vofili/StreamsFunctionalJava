package com.vofili;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

public class Main {

public static List<Apples> generateApples(){
    List<Apples> result = new ArrayList<Apples>();

    Apples obj1 = new Apples();
    obj1.setAppleType(FruitType.ORGANIC);
    obj1.setAppleColor(Color.RED);
    obj1.setAppleWeight(100);
    result.add(obj1);



    Apples obj2 = new Apples();
    obj2.appleWeight = 90;
    obj2.appleColor=Color.RED;
    obj2.appleType = FruitType.ORGANIC;
    result.add(obj2);



    var obj3 = new Apples();
    obj3.appleWeight = 155;
    obj3.appleColor = Color.GREEN;
    obj3.appleType=FruitType.HANDPICKED;
    result.add(obj3);

    var obj4 = new Apples();
    obj4.setAppleColor(Color.GREEN);
    obj4.setAppleWeight(58);
    obj4.setAppleType(FruitType.GMO);
    result.add(obj4);


    return result;
}


    public static void main(String[] args) {
        List<Apples> basket = generateApples();

        List<Apples> filteredApples = filterGreenApples(basket);
        System.out.println(filteredApples);

        List<Apples> filteredHeavy = filterHeavyApples(basket);
        System.out.println(filteredHeavy);

        List<Apples> greenApples = filterApples(basket,(Apples a)-> a.getAppleColor().equals(Color.GREEN));
        List<Apples> heavyApples = filterApples(basket,(Apples a)->a.getAppleWeight()>= 100);
        System.out.println(greenApples);
        System.out.println(heavyApples);
    }

    public static List<Apples> filterGreenApples(List<Apples> basket){
        List<Apples> result = new ArrayList();
            for(Apples apple:basket){
                    if(Color.GREEN.equals(apple.getAppleColor())){
                        result.add(apple);
                    }
            }
        return result;
    }

    public static List<Apples> filterHeavyApples(List<Apples> basket){
        List<Apples> result = new ArrayList();
        for(Apples apple : basket){
            if(apple.getAppleWeight() > 75)
                result.add(apple);

        }
        return result;
    }

    public static List <Apples> filterApples(List<Apples> inventory, Predicate<Apples> p){
        List<Apples> result = new ArrayList<Apples>();
        for(Apples apples: inventory){
                if(p.test(apples)){
                    result.add(apples);
                }
        }
        return result;
    }

    public boolean isHeavyApple(Apples a){
        return a.getAppleWeight() > 100;
    }
    public boolean isGreenApple(Apples a)
    {
        return a.getAppleColor().equals(Color.GREEN);
    }
}