package terminal.allExecute.create;

import animals.Wolf;
import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.CommandText;
import zoo.Zoo;

/**
 * Add wolf to cage in zoo
 */
public class CreateWolf implements CommandExecutable {
    private final Zoo zoo;
    private Wolf wolf;

    public CreateWolf(Zoo zoo) {
        this.zoo = zoo;
    }

    public void wolfParameters(CommandText command) {
        this.wolf = new Wolf(command.getParameters().get("age"),
                command.getParameters().get("weight"), command.getParameters().get("limbs"));
    }

    @Override
    public void execute() {
        this.zoo.addWolf(this.wolf);
    }
}
