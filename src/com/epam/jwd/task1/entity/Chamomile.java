package com.epam.jwd.task1.entity;

import java.math.BigDecimal;

public class Chamomile extends Flower{

    private  int numberFlowersInBranch;

    public Chamomile(String Color, BigDecimal cost, int dayStorage, int stemLength, int numberFlowersInBranch) {
        super(Color, cost, dayStorage, stemLength);
        this.numberFlowersInBranch = numberFlowersInBranch;
    }

    public int getNumberFlowersInBranch(){
        return numberFlowersInBranch;
    }
    public void setNumberFlowersInBranch(int numberFlowersInBranch){
        this.numberFlowersInBranch = numberFlowersInBranch;
    }

    @Override
    public String toString(){
        return "Chamomile" + "Color = " + getColor() +
                "; Cost = " + getCost() +
                "; DayStorage = " + getDayStorage() +
                "; StemLength" + getStemLength() +
                "; presenceSpikes: " + numberFlowersInBranch;
    }

}
