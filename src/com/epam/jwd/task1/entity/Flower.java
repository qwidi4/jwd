package com.epam.jwd.task1.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Flower {

    private String color;
    private BigDecimal cost;
    private int dayStorage;
    private int stemLength;

    public Flower (String color,BigDecimal cost, int dayStorage, int stemLength){
        this.color = color;
        this.cost = cost;
        this.dayStorage = dayStorage;
        this.stemLength = stemLength;
    }

    public String getColor(){
        return color;
    }

    public BigDecimal getCost() {return cost; }

    public int getDayStorage(){
        return dayStorage;
    }

    public int getStemLength(){
        return stemLength;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setCost(BigDecimal cost){
        this.cost = cost;
    }

    public void setDayStorage(int dayStorage){
        this.dayStorage = dayStorage;
    }

    public void setStemLength(int stemLength){
        this.stemLength = stemLength;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower that = (Flower) o;
        return getColor() == that.getColor() && getDayStorage() == that.getDayStorage() && getStemLength() == that.getStemLength() && getCost() == that.getCost();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getColor(), getStemLength(), getDayStorage(), getCost());
    }

    @Override
    public String toString(){
        return "Color = " + color +
                "; Cost = " + cost +
                "; DayStorage = " + dayStorage +
                "; StemLength" + stemLength;
    }
}
