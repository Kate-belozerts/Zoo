package zoo;

import animals.Animal;
import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;

import java.util.*;

/**
 * Zoo contains three type of cages: wolf's cage, lion's cage and snake terrarium.
 */
public class Zoo {
    private final AnimalCage<Wolf> wolfCage;
    private final AnimalCage<Lion> lionCage;
    private final AnimalCage<Snake> snakeTerrarium;

    public Zoo() {
        this.wolfCage = new WolfCage(new ArrayList<>());
        this.lionCage = new LionCage(new ArrayList<>());
        this.snakeTerrarium = new SnakeCage(new ArrayList<>());
    }

    @Override
    public String toString() {
        return "Zoo contains: " +
                "\nWolf Cage - " + wolfCage +
                "\nLion Cage - " + lionCage +
                "\nSnake Terrarium - " + snakeTerrarium;
    }

    /**
     * Amount of animal in each cage
     */
    public void showCount() {
        System.out.println("Lions : " + this.lionCage.countInCage());
        System.out.println("Wolfs : " + this.wolfCage.countInCage());
        System.out.println("Snakes : " + this.snakeTerrarium.countInCage() + "\n");
    }

    public void addWolf(Wolf wolf) {
        wolfCage.addToCage(wolf);
    }

    public void addLion(Lion lion) {
        lionCage.addToCage(lion);
    }

    public void addSnake(Snake snake) {
        snakeTerrarium.addToCage(snake);
    }

    public void pickWolfFromCage() {
        wolfCage.pickAnimalFromCage();
    }

    public void pickLionFromCage() {
        lionCage.pickAnimalFromCage();
    }

    public void pickSnakeFromCage() {
        snakeTerrarium.pickAnimalFromCage();
    }

    public void addRandomAnimal() {
        int rnd = new Random().nextInt(3);

        Lion randomLion = new Lion(new Random().nextInt(1, 15),
                new Random().nextInt(200), new Random().nextInt(50), 4);
        Wolf randomWolf = new Wolf(5, 50, 4);
        Snake randomSnake = new Snake(3, 15, 70);

        List<Animal> choose = Arrays.asList(randomLion, randomSnake, randomWolf);
        if (choose.get(rnd).getType().equals("Lion")) lionCage.addToCage(randomLion);
        else if (choose.get(rnd).getType().equals("Wolf")) wolfCage.addToCage(randomWolf);
        else if (choose.get(rnd).getType().equals("Snake")) snakeTerrarium.addToCage(randomSnake);
    }

    public void deleteRandomAnimal() {
        if (wolfCage.countInCage() > 0) wolfCage.pickAnimalFromCage();
        else if (lionCage.countInCage() > 0) lionCage.pickAnimalFromCage();
        else if (snakeTerrarium.countInCage() > 0) snakeTerrarium.pickAnimalFromCage();
        else System.out.println("Животных в зоопарке нет! ");
    }
}
