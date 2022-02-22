package com.epam.jwd.task1.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bouquet {
     Chamomile Chamomile1 = new Chamomile("White",
             new BigDecimal(6.15),
             6,
             20,
             4);
     Chamomile Chamomile2 = new Chamomile("White",
             new BigDecimal(6.25),
             4,
             20,
             3);
     Chamomile Chamomile3 = new Chamomile("Blue",
             new BigDecimal(7.85),
             2,
             20,
             2);
     Chamomile Chamomile4 = new Chamomile("Yellow",
             new BigDecimal(4.55),
             5,
             20,
             4);

     private List<Chamomile> ChamomileFlowers;

     Rose Rose1 = new Rose("Red",
             new BigDecimal(10.25),
             4,
             25,
             false);
     Rose Rose2 = new Rose("Pink",
             new BigDecimal(11.5),
             3,
             25,
             false);
     Rose Rose3 = new Rose("Blue",
             new BigDecimal(7.2),
             6,
             30,
             true);
     Rose Rose4 = new Rose("White",
             new BigDecimal(7.95),
             5,
             4,
             true);

     private List<Rose> RoseFlowers;

     public Bouquet(){
          ChamomileFlowers = new ArrayList<>(Arrays.asList(Chamomile1,
                  Chamomile2,
                  Chamomile3,
                  Chamomile4));
          RoseFlowers = new ArrayList<>(Arrays.asList(Rose1,
                  Rose2,
                  Rose3,
                  Rose4));
     }

     public List<Chamomile> getChamomileFlowers() {
          return ChamomileFlowers;
     }

     public void setChamomileFlowers(List<Chamomile> ChamomileFlowers){
          this.ChamomileFlowers = ChamomileFlowers;
     }

     public List<Rose> getRoseFlowers() {
          return RoseFlowers;
     }

     public void setRoseFlowers(List<Rose> RoseFlowers){
          this.RoseFlowers = RoseFlowers;
     }
}
