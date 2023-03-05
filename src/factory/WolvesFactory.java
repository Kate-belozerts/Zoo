package factory;

import animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolvesFactory {
    static public ArrayList<Wolf> createWolf(int wolfCount) {
        ArrayList<Wolf> wolfInCage = new ArrayList<>(wolfCount);
        for (int i = 0; i < wolfCount; i++) {
            Wolf wolf = new Wolf(new Random().nextInt(3, 15),
                    new Random().nextInt(60), 4);
            wolfInCage.add(wolf);
        }
        return wolfInCage;
    }
}
