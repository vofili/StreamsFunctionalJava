package com.vofili.behaviourparameterization;

import com.vofili.Helpers;

public class ApplePrintWeight implements ApplePrintInterface <Apple>{
    public String printOut(Apple a){
        String output="This Apple is "+a.getWeight()+" grams in weight";
        Helpers.printt(output);
        return output;
    }
}
