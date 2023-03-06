package factory;

import animals.Snake;

import java.util.ArrayList;
import java.util.Random;

/**
 * Fill the terrarium with snakes
 */
public class SnakesFactory {
    static public ArrayList<Snake> createSnake(int snakeCount) {
        ArrayList<Snake> snakeTerrarium = new ArrayList<>(snakeCount);
        for (int i = 0; i < snakeCount; i++) {
            Snake snake = new Snake(new Random().nextInt(20), new Random().nextInt(20),
                    new Random().nextInt(500));
            snakeTerrarium.add(snake);
        }
        return snakeTerrarium;
    }
}
