package com.vofili.behaviourparameterization;

import com.vofili.Helpers;

public class ApplePrintColor implements ApplePrintInterface<Apple>{
    public String printOut(Apple a){
        String output = "This Apple is "+a.getColor()+" in colour";
        Helpers.printt(output);
                return output;
    }
}
