package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.entity.Bouquet;
import com.epam.jwd.task1.entity.Flower;

import java.util.ArrayList;
import java.util.List;

public class SortByDayStorage {

        Bouquet Bouquet = new Bouquet();
        List<Flower> Flowers = new ArrayList<>();
        CompareFlower Compare = new CompareFlower();

        public void SortByDayStorage(){
            Bouquet.getChamomileFlowers().sort(Compare);

            for (Flower flower : Bouquet.getChamomileFlowers()) {
                System.out.println(flower);
            }

            Bouquet.getRoseFlowers().sort(Compare);

            for (Flower flower : Bouquet.getRoseFlowers()) {
                System.out.println(flower);
            }



     }
    }

