package animals.emptyAnimals;

import animals.Snake;

public class EmptySnake extends Snake {
    private static EmptySnake emptySnake;

    private EmptySnake(int age, int weight, int snakeLength) {
        super(age, weight, snakeLength);
    }

    public static EmptySnake newEmptySnake() {
        if (emptySnake == null) {
            emptySnake = new EmptySnake(0, 0, 0);
        }
        return emptySnake;
    }

    @Override
    public String toString() {
        return "Змей нет! ";
    }
}
