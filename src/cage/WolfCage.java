package cage;

import animals.Wolf;
import animals.comparators.WolfComparator;
import cage.iterators.WolfIterator;

import java.util.*;

/**
 * Cage with wolves
 */
public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {
    private final ArrayList<Wolf> wolves;
    private int levelOfDirty;

    public WolfCage(ArrayList<Wolf> wolves) {
        this.wolves = wolves;
    }

    @Override
    public String toString() {
        return "Condition of this Wolf Cage: " + wolves +
                "\nGrade of cleanness - " + levelOfDirty;
    }

    @Override
    public void addToCage(Wolf animal) {
        wolves.add(animal);
    }

    @Override
    public void giveFood(int weightFood) {
        int onePortion = 0;
        if (wolves.size() > 0) {
            onePortion = weightFood / wolves.size();
            if (onePortion < 5) {
                System.out.println("Это маловато для одного приема пищи... ");
            }
        }
        for (Wolf wolf : wolves) {
            wolf.feed(onePortion);
        }
    }

    @Override
    public void cleaning() {
        if (this.levelOfDirty > 7) {
            this.levelOfDirty = 0;
            System.out.println("Почистили");
        } else System.out.println("Еще нормально, обратитесь позже");
    }

    @Override
    public Wolf pickAnimalFromCage() {
        if (wolves.size() == 0) return null;
        int rnd = new Random().nextInt(wolves.size());
        System.out.println("Забрали у вас одного волка" +
                ", осталось - " + (wolves.size()-1));
        return wolves.remove(rnd);
    }

    @Override
    public void deleteOlderThan(int limitAge) {
        wolves.removeIf(wolf -> wolf.getAge() > limitAge);
    }

    @Override
    public int countInCage() {
        return this.wolves.size();
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolves);
    }

    public void sortByWeightAndAge() {
        Collections.sort(wolves, new WolfComparator());
    }

    public void comparing() {
        Comparator<Wolf> comparator =
                Comparator.comparing(Wolf::getAge)
                        .thenComparing(Wolf::getWeight);
        Collections.sort(this.wolves, comparator);
    }

    public void setLevelOfDirty(int levelOfDirty) {
        this.levelOfDirty = levelOfDirty;
    }
}
