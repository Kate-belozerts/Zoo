import animalUtils.AnimalUtils;
import animals.Lion;
import animals.Wolf;

import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolvesFactory;
import terminal.communicate.TerminalReader;
//import terminal.processing.ParserNumber;
import terminal.processing.ParserText;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        createLions();
//        createWolves();

//        TerminalReader reader = TerminalReader.newTerminalReader(new ParserNumber());

        TerminalReader reader = TerminalReader.newTerminalReader(new ParserText());
        reader.endless();
    }

    public static void cleanTheCage(LionCage cages) {
        cages.setLevelOfDirty(7);
        System.out.println(cages);
        cages.cleaning();
        System.out.println(cages);
    }

    public static void createLions() {
        List<Lion> lions = LionsFactory.createLions(5);
        LionCage lionsInCage = new LionCage(lions);

        cleanTheCage(lionsInCage);

        lionsInCage.pickAnimalFromCage();

        lionsInCage.sortLion();
        System.out.println(lionsInCage);

        lionsInCage.giveFood(500);
        System.out.println(lionsInCage);
    }

    public static void createWolves() {
        List<Wolf> wolves = WolvesFactory.createWolf(7);
        WolfCage wolvesInCage = new WolfCage(wolves);

        AnimalUtils.sortAnimals(wolves);
        System.out.println(wolves);
        System.out.println(wolvesInCage);

        wolvesInCage.sortByAge(wolves);

        wolvesInCage.giveFood(150);
        System.out.println(wolvesInCage);
        wolvesInCage.sortByWeightAndAge();
        System.out.println(wolvesInCage.pickAnimalFromCage());

        System.out.println(wolvesInCage);
        wolvesInCage.deleteOlderThan(10);
        System.out.println(wolvesInCage);
    }
}
