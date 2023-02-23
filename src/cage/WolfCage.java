package cage;

import animals.Animal;
import animals.Wolf;
import animals.comparators.WolfComparator;
import cage.iterators.WolfIterator;

import java.util.*;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {
    private ArrayList<Wolf> wolves;
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
        if (wolves.size() == 0) return;
        int onePortion = weightFood / wolves.size();
        if (onePortion < 5) {
            System.out.println("Это маловато для одного приема пищи... ");
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
                ", осталось - " + wolves.size());
        return wolves.remove(rnd);
    }

    @Override
    public void deleteOlderThan(int limitAge) {
        Iterator<Wolf> wolfIterator = wolves.iterator();
        while (wolfIterator.hasNext()) {
            Wolf wolf = wolfIterator.next();
            if (wolf.getAge() > limitAge) {
                wolfIterator.remove();
            }
        }
    }

    public void sortByWeightAndAge() {
        Collections.sort(wolves, new WolfComparator());
    }

    public void setLevelOfDirty(int levelOfDirty) {
        this.levelOfDirty = levelOfDirty;
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolves);
    }
}
