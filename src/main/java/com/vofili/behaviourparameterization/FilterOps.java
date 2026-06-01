package com.vofili.behaviourparameterization;

import com.vofili.Apples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Optional.*;
public class FilterOps {

    List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> basket=new ArrayList<Apple>();
        for(Apple apple:inventory){
            if(apple.getColor().toString().equalsIgnoreCase("GREEN")){
                basket.add(apple);
            }
        }



        return basket;
    }

    List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> basket = new ArrayList<Apple>();
        for(Apple apple:inventory){
            if(apple.getWeight() >= 100){
                basket.add(apple);
            }
        }
        return basket;
    }
}
