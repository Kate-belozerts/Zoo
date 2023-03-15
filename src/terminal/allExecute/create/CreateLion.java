package terminal.allExecute.create;

import animals.Lion;
import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.CommandText;
import zoo.Zoo;

/**
 * Add lion to cage in zoo
 */
public class CreateLion implements CommandExecutable {
    private final Zoo zoo;
    private Lion lion;

    public CreateLion(Zoo zoo) {
        this.zoo = zoo;
    }

    public void lionParameters(CommandText command) {
        this.lion = new Lion(command.getParameters().get("age"),
                command.getParameters().get("weight"), command.getParameters().get("volume"),
                command.getParameters().get("limbs"));
    }

    @Override
    public void execute() {
        this.zoo.addLion(this.lion);
    }
}
