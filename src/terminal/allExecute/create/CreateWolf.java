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
    private final CommandText commandText;


    public CreateWolf(Zoo zoo, CommandText commandText) {
        this.zoo = zoo;
        this.commandText = commandText;
    }

    public void wolfParameters() {
        this.wolf = new Wolf(this.commandText.getParameters().get("age"),
                this.commandText.getParameters().get("weight"), this.commandText.getParameters().get("limbs"));
    }

    @Override
    public void execute() {
        wolfParameters();
        this.zoo.addWolf(this.wolf);
    }
}
