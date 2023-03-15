package animalUtils.comparators;

import animals.Animal;

import java.util.Comparator;

/**
 * Compare animals with their ages
 */
public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
