package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.entity.Bouquet;
import com.epam.jwd.task1.entity.Chamomile;
import com.epam.jwd.task1.entity.Flower;
import com.epam.jwd.task1.entity.Rose;

import java.math.BigDecimal;

public class BouquetCost {
    private BigDecimal BouquetCost;
    private BigDecimal ChamomileCost;
    private BigDecimal RoseCost;

    Bouquet Bouquet = new Bouquet();

    public BigDecimal getBouquetCost(Chamomile Chamomile, Rose Rose){
        for(Chamomile ChamomileFlower: Bouquet.getChamomileFlowers()){
            ChamomileCost = new BigDecimal(0).add(ChamomileFlower.getCost());
        }

        for(Rose RoseFlower: Bouquet.getRoseFlowers()){
            RoseCost = new BigDecimal(0).add(RoseFlower.getCost());
        }

       return BouquetCost = new BigDecimal(0).add(ChamomileCost).add(RoseCost);
    }


}
