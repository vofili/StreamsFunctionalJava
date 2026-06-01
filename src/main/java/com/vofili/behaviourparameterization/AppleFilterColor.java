package com.vofili.behaviourparameterization;

import java.util.function.Predicate;

public class AppleFilterColor implements Predicate<Apple> {

    public boolean test(Apple a){
        return a.getColor().equals(Color.RED);
    }
}
