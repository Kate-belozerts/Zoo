package terminal.allExecute.delete;

import terminal.allExecute.CommandExecutable;
import zoo.Zoo;

/**
 * Remove random animal from the whole zoo
 */
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
