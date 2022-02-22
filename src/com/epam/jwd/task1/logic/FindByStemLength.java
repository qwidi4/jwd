
package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.entity.Bouquet;
import com.epam.jwd.task1.entity.Chamomile;
import com.epam.jwd.task1.entity.Flower;
import com.epam.jwd.task1.entity.Rose;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FindByStemLength {
    private int StartRange = 25;
    private int FinishRange = 30;

   Bouquet Bouquet = new Bouquet();
   List<Flower> Flowers = new ArrayList<>();

    public void getBouquetCost(Chamomile Chamomile, Rose Rose){
        for(Flower flower : Bouquet.getChamomileFlowers()){
            if(flower.getStemLength() > StartRange &&flower.getStemLength() <= FinishRange)
                System.out.println(flower);

        }

        for(Flower flower : Bouquet.getRoseFlowers()){
            if(flower.getStemLength() > StartRange && flower.getStemLength() <= FinishRange)
                System.out.println(flower);
        }
    }

}

