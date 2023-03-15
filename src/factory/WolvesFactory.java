package factory;

import animals.Wolf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Fill the cage with wolves
 */
public class WolvesFactory {
    static public List<Wolf> createWolf(int wolfCount) {
        List<Wolf> wolfInCage = new ArrayList<>();
        if (wolfCount > 0) {
            for (int i = 0; i < wolfCount; i++) {
                Wolf wolf = new Wolf(new Random().nextInt(3, 15),
                        new Random().nextInt(60), 4);
                wolfInCage.add(wolf);
            }
        }
        return wolfInCage;
    }
}
