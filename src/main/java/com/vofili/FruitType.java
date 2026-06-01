package com.vofili;

public enum FruitType {
    GMO(1),HANDPICKED(2),INORGANIC(3),ORGANIC(4);
    private final int naturalScore;
        FruitType(int naturalScore){
            this.naturalScore = naturalScore;
        }


}
