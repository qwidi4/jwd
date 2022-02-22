package com.epam.jwd.task1.entity;

import java.math.BigDecimal;

public class Rose extends Flower{

    private boolean presenceSpikes;

    public Rose(String color, BigDecimal cost, int dayStorage, int stemLength, boolean presenceSpikes) {
        super(color, cost, dayStorage, stemLength);
        this.presenceSpikes = presenceSpikes;
    }

    public boolean getPresenceSpikes(){
        return presenceSpikes;
    }

    public void setPresenceSpikes(boolean presenceSpikes){
        this.presenceSpikes = presenceSpikes;
    }

    @Override
    public String toString(){
        return "Rose" + "Color = " + getColor() +
                "; Cost = " + getCost() +
                "; DayStorage = " + getDayStorage() +
                "; StemLength" + getStemLength() +
                "; presenceSpikes: " + presenceSpikes;
    }
}
