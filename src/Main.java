import animalUtils.AnimalUtils;
import animals.Lion;
import animals.Wolf;
import cage.AnimalCage;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolvesFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        createLions();
        createWolves();

    }

    public static void cleanTheCage(LionCage cages) {
        cages.setLevelOfDirty(7);
        System.out.println(cages);
        cages.cleaning();
        System.out.println(cages);
    }

    public static void createLions() {
        ArrayList<Lion> lions = LionsFactory.createLions(5);
        LionCage lionsInCage = new LionCage(lions);

        cleanTheCage(lionsInCage);

        lionsInCage.pickAnimalFromCage();

        lionsInCage.sortLion();
        System.out.println(lionsInCage);

        lionsInCage.giveFood(500);
        System.out.println(lionsInCage);
    }

    public static void createWolves() {
        ArrayList<Wolf> wolves = WolvesFactory.createWolf(7);
        WolfCage wolvesInCage = new WolfCage(wolves);

        AnimalUtils.sortAnimals(wolves);
        System.out.println(wolves);

        System.out.println(wolvesInCage);
        wolvesInCage.giveFood(150);

        wolvesInCage.sortByWeightAndAge();

        System.out.println(wolvesInCage.pickAnimalFromCage());

        System.out.println(wolvesInCage);

        for (Wolf wolf :
                wolvesInCage) {
            System.out.println(wolf);
        }

        wolvesInCage.deleteOlderThan(10);
        System.out.println(wolvesInCage);
    }
}
