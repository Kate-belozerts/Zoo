package cage;

import animals.emptyAnimals.EmptyLion;
import animals.Lion;
import animalUtils.comparators.AnimalComparator;
import animalUtils.comparators.LionComparator;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Cage with lions
 */
public class LionCage implements AnimalCage<Lion> {
    private final List<Lion> lions;
    private int levelOfDirty;

    public LionCage(List<Lion> lions) {
        this.lions = lions;
    }

    public void sortByVolume() {
        Collections.sort(lions, new LionComparator());
    }

    public void sortLion() {
        Collections.sort(this.lions, new AnimalComparator());
    }

    @Override
    public String toString() {
        return "Condition of this Lion Cage: " + lions +
                "\nGrade of cleanness - " + levelOfDirty;
    }

    @Override
    public void addToCage(Lion animal) {
        lions.add(animal);
    }

    @Override
    public void giveFood(int weightFood) {
        int onePortion = 0;
        if (lions.size() > 0) {
            onePortion = weightFood / lions.size();
            if (onePortion < 5) {
                System.out.println("Это маловато для одного приема пищи. " +
                        "Лев оголодает и в следующий раз может съесть вас");
            }
        }
        for (Lion lion : lions) {
            lion.feed(onePortion);
        }
    }

    @Override
    public void cleaning() {
        if (this.levelOfDirty > 5) {
            this.levelOfDirty = 0;
            System.out.println("Почистили");
        } else System.out.println("Еще нормально, обратитесь позже");
    }

    @Override
    public Lion pickAnimalFromCage() {
        if (lions.size() > 0) {
            System.out.println("Забрали у вас одного львенка" +
                    ", осталось - " + (lions.size() - 1));
            return lions.remove(new Random().nextInt(lions.size()));
        } else return EmptyLion.newEmptyLion();
    }

    @Override
    public void deleteOlderThan(int limitAge) {
        lions.removeIf(lion -> lion.getAge() > limitAge);
    }

    public int countInCage() {
        return this.lions.size();
    }

    public void setLevelOfDirty(int levelOfDirty) {
        this.levelOfDirty = levelOfDirty;
    }
}
