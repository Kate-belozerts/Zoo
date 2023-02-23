package cage;

import animals.Snake;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SnakeCage implements AnimalCage<Snake>{
    private List<Snake> snakesTerrarium;
    private int levelOfDirty;

    @Override
    public void addToCage(Snake animal) {
        snakesTerrarium.add(animal);
    }

    @Override
    public void giveFood(int weightFood) {
        if (snakesTerrarium.size() == 0) return;
        int onePortion = weightFood / snakesTerrarium.size();
        if (onePortion < 10) {
            System.out.println("Лучше прибавить порцию");
        }
        for (Snake snake : snakesTerrarium) {
            snake.feed(onePortion);
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
    public Snake pickAnimalFromCage() {
        if (snakesTerrarium.size() == 0) return null;
        int rnd = new Random().nextInt(snakesTerrarium.size());
        System.out.println("Забрали змею");
        return snakesTerrarium.remove(rnd);
    }

    @Override
    public void deleteOlderThan(int limitAge) {
        Iterator<Snake> snakeIterator = snakesTerrarium.iterator();
        while (snakeIterator.hasNext()){
            Snake snake = snakeIterator.next();
            if (snake.getAge() > limitAge){
                snakeIterator.remove();
            }
        }
    }

}
