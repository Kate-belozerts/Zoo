package terminal.allExecute.delete;

import terminal.allExecute.CommandExecutable;
import zoo.Zoo;

public class DeleteSnake implements CommandExecutable {
    private Zoo zoo;
    @Override
    public void execute() {
        this.zoo.pickSnakeFromCage();
    }
}
