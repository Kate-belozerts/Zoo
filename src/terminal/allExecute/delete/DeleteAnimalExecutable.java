package terminal.allExecute.delete;

import terminal.allExecute.CommandExecutable;
import zoo.Zoo;

public class DeleteAnimalExecutable implements CommandExecutable {
    private final Zoo zoo;

    public DeleteAnimalExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.deleteRandomAnimal();
    }
}
