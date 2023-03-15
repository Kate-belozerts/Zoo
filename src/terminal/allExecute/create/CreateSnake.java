package terminal.allExecute.create;

import animals.Snake;
import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.CommandText;
import zoo.Zoo;

/**
 * Add snake to terrarium in zoo
 */
public class CreateSnake implements CommandExecutable {
    private final Zoo zoo;
    private Snake snake;

    public CreateSnake(Zoo zoo) {
        this.zoo = zoo;
    }

    public void snakeParameters(CommandText command) {
        this.snake = new Snake(command.getParameters().get("age"),
                command.getParameters().get("weight"), command.getParameters().get("length"));
    }

    @Override
    public void execute() {
        this.zoo.addSnake(this.snake);
    }
}
