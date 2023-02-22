package cage;

import animals.Animal;
import animals.Lion;
import animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolfCage implements AnimalCage {
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
    public void addToCage(Animal animal) {
        if (animal instanceof Wolf) {
            wolves.add((Wolf) animal);
        }
    }

    @Override
    public void giveFood(int weightFood) {
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
    public void pickAnimalFromCage() {
        int rnd = new Random().nextInt(wolves.size());
        wolves.remove(rnd);
        System.out.println("Забрали у вас одного волка");
    }

    @Override
    public void sortByAge() {
    }

    public void setLevelOfDirty(int levelOfDirty) {
        this.levelOfDirty = levelOfDirty;
    }
}
