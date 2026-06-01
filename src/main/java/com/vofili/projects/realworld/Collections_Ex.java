package com.vofili.projects.realworld;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

import static com.vofili.Helpers.print;


public class Collections_Ex {



    public static void main(String[] args) {
        //Demonstrate the HashMap implementation of the Map collection structure
        Person per=new Person();
        Map<Id,Message> mapMessages = new HashMap();
        print(mapMessages);
        print(per.getName());
        print(per.getCar());
        if(per.getCar().toString().equals("toyota")){
            print("insurance premium is cheap");
        }else{
            print("Insurance permium is expensive");
        }
    }
}
