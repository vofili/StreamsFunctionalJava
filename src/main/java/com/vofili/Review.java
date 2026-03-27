package com.vofili;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Review {


    public static void main(String[] args){
            Bags bg1 = new Bags(1,50,"Blue","Leather");
            Bags bg2 = new Bags(2,35, "Green","Rubber");
            Bags bg3 = new Bags(3,10,"Red","Rubber");
            ArrayList<Bags> bgList = new ArrayList<Bags>();
            bgList.add(bg1);
            bgList.add(bg2);
            bgList.add(bg3);

          Collections.sort(bgList,new SortByWeight());

            for(Bags item : bgList){
                System.out.println(item);
        }
    }
}


class SortByWeight implements Comparator<Bags>{
    public int compare(Bags b1, Bags b2){
       return b1.getWeight().compareTo(b2.getWeight());
    }
 }
class Bags{
    Integer id;
    Integer weight;
    String color;
    String type;

    public Bags(Integer id, Integer weight, String color, String type) {
        this.id = id;
        this.weight = weight;
        this.color = color;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bags{" +
                "id=" + id +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
