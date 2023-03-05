package terminal.allExecute.create;

import terminal.allExecute.CommandExecutable;
import zoo.Zoo;

public class CreateAnimalExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateAnimalExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.addRandomAnimal();
    }
}
