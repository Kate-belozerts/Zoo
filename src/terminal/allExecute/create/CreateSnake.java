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
    private final CommandText commandText;

    public CreateSnake(Zoo zoo, CommandText commandText) {
        this.zoo = zoo;
        this.commandText = commandText;
    }

    public void snakeParameters() {
        this.snake = new Snake(this.commandText.getParameters().get("age"),
                this.commandText.getParameters().get("weight"), this.commandText.getParameters().get("length"));
    }

    @Override
    public void execute() {
        snakeParameters();
        this.zoo.addSnake(this.snake);
    }
}
