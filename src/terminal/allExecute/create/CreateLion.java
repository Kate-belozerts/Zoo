package terminal.allExecute.create;

import animals.Lion;
import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.Command;
import terminal.communicate.inputData.CommandText;
import zoo.Zoo;

/**
 * Add lion to cage in zoo
 */
public class CreateLion implements CommandExecutable {
    private final Zoo zoo;
    private Lion lion;
    private final CommandText commandText;

    public CreateLion(Zoo zoo, CommandText command) {
        this.zoo = zoo;
        this.commandText = command;
    }

    private void lionParameters() {
        this.lion = new Lion(commandText.getParameters().get("age"),
                commandText.getParameters().get("weight"), commandText.getParameters().get("volume"),
                commandText.getParameters().get("limbs"));
    }

    @Override
    public void execute() {
        lionParameters();
        this.zoo.addLion(this.lion);
    }
}
