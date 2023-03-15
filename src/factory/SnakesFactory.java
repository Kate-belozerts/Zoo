package factory;

import animals.Snake;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Fill the terrarium with snakes
 */
public class SnakesFactory {
    static public List<Snake> createSnake(int snakeCount) {
        List<Snake> snakeTerrarium = new ArrayList<>();
        if (snakeCount > 0) {
            for (int i = 0; i < snakeCount; i++) {
                Snake snake = new Snake(new Random().nextInt(20), new Random().nextInt(20),
                        new Random().nextInt(500));
                snakeTerrarium.add(snake);
            }
        }
        return snakeTerrarium;
    }
}
