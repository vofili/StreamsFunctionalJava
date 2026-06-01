package com.vofili.behaviourparameterization;

import java.util.function.Predicate;

public class AppleFilterHeavy implements Predicate<Apple> {

    public boolean test(Apple a){
        if(a.getWeight() > 50) {
            return true;
        }else{
            return false;
        }
    }
}
