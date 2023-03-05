package terminal.allExecute.create;

import animals.Snake;
import terminal.allExecute.CommandExecutable;
import zoo.Zoo;

public class CreateSnake implements CommandExecutable {
    private final Zoo zoo;
    private final Snake snake;

    public CreateSnake(Zoo zoo, Snake snake) {
        this.zoo = zoo;
        this.snake = snake;
    }

    @Override
    public void execute() {
        this.zoo.addSnake(snake);
    }
}
