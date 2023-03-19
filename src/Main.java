import animalUtils.AnimalUtils;
import animals.Lion;
import animals.Wolf;

import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolvesFactory;
import terminal.communicate.TerminalReader;
import terminal.communicate.output.Tuple;
import terminal.processing.ParserNumber;
import terminal.processing.ParserText;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        createLions(); // <- pickAnimalFromCage с новым эксепшеном
//        createWolves(); // <- новый компаратор в действии

        Tuple numOrInt = choice();
//        TerminalReader reader = TerminalReader.newTerminalReader(numOrInt.getCommandParser(), numOrInt.getNumber()); // от первого tuple
        TerminalReader reader = TerminalReader.newTerminalReader(numOrInt.commandParser(), numOrInt.number());
        reader.endless();
    }

    public static Tuple choice() {
        Scanner choice = new Scanner(System.in);
        System.out.println("1 - ввод цифрами\n2 - ввод словами");
        int result = choice.nextInt();
        if (result == 1) {
            return new Tuple(1, new ParserNumber());
        } else return new Tuple(2, new ParserText());
    }

    public static void cleanTheCage(LionCage cages) {
        cages.setLevelOfDirty(7);
        System.out.println(cages);
        cages.cleaning();
        System.out.println(cages);
    }

    public static void createLions() {
        List<Lion> lions = LionsFactory.createLions(0);
        LionCage lionsInCage = new LionCage(lions);
        System.out.println(lionsInCage.pickAnimalFromCage());

//        cleanTheCage(lionsInCage);
//        lionsInCage.sortLion();
//        System.out.println(lionsInCage);
//
//        lionsInCage.giveFood(500);
//        System.out.println(lionsInCage);
    }

    public static void createWolves() {
        List<Wolf> wolves = WolvesFactory.createWolf(7);
        WolfCage wolvesInCage = new WolfCage(wolves);

        System.out.println(wolvesInCage);
        wolvesInCage.compare();
        System.out.println(wolvesInCage);

//        System.out.println(wolvesInCage.pickAnimalFromCage()); // после compare не хочет работать почему-то..
    }
}
