package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.entity.Flower;
import java.util.Comparator;


public class CompareFlower implements Comparator<Flower> {
    @Override
    public int compare(Flower Flower1, Flower Flower2){
        return Integer.compare(Flower1.getDayStorage(), Flower2.getDayStorage());
    }
}
