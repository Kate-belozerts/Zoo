import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolvesFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(5);
        LionCage lionsInCage = new LionCage(lions);

        cleanTheCage(lionsInCage);

        lionsInCage.pickAnimalFromCage();

        lionsInCage.sortLion();
        System.out.println(lionsInCage);

        lionsInCage.giveFood(500);
        System.out.println(lionsInCage);

        ArrayList<Wolf> wolves = WolvesFactory.createWolf(0);
        WolfCage wolvesInCage = new WolfCage(wolves);
        System.out.println(wolvesInCage);

//        ArrayList<Wolf> wolves = WolvesFactory.createWolf(3);
//        WolfCage wolvesInCage = new WolfCage(wolves);

        wolvesInCage.giveFood(200);
        System.out.println(wolvesInCage);
        wolvesInCage.pickAnimalFromCage();
    }

    public static void cleanTheCage(LionCage cages) {
        cages.setLevelOfDirty(7);
        System.out.println(cages);
        cages.cleaning();
        System.out.println(cages);
    }

}
