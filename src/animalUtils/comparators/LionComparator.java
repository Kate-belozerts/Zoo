package animalUtils.comparators;

import animals.Lion;

import java.util.Comparator;

/**
 * Compare lions with their volume of mane
 */
public class LionComparator implements Comparator<Lion> {
    @Override
    public int compare(Lion o1, Lion o2) {
        if (o1.getVolume() > o2.getVolume()) {
            return 1;
        } else if (o1.getVolume() < o2.getVolume()) {
            return -1;
        }
        return 0;
    }
}
