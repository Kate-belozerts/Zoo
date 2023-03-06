package terminal.allExecute.create;

import animals.Wolf;
import terminal.allExecute.CommandExecutable;
import zoo.Zoo;

/**
 * Add wolf to cage in zoo
 */
public class CreateWolf implements CommandExecutable {
    private final Zoo zoo;
    private final Wolf wolf;

    public CreateWolf(Zoo zoo, Wolf wolf) {
        this.zoo = zoo;
        this.wolf = wolf;
    }

    @Override
    public void execute() {
        this.zoo.addWolf(this.wolf);
    }
}
