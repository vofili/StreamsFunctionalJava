package com.vofili;

public class Apples
{
    Color appleColor;
    int appleWeight;
    FruitType appleType;

    public Color getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(Color appleColor) {
        this.appleColor = appleColor;
    }

    public int getAppleWeight() {
        return appleWeight;
    }

    public void setAppleWeight(int appleWeight) {
        this.appleWeight = appleWeight;
    }

    public FruitType getAppleType() {
        return appleType;
    }

    public void setAppleType(FruitType appleType) {
        this.appleType = appleType;
    }

    @Override
    public String toString() {
        return "Apples{" +
                "appleColor=" + appleColor +
                ", appleWeight=" + appleWeight +
                ", appleType=" + appleType +
                '}';
    }
}
