package terminal.allExecute.create;

import animals.Lion;
import terminal.allExecute.CommandExecutable;
import zoo.Zoo;

/**
 * Add lion to cage in zoo
 */
public class CreateLion implements CommandExecutable {
    private final Zoo zoo;
    private final Lion lion;

    public CreateLion(Zoo zoo, Lion lion) {
        this.zoo = zoo;
        this.lion = lion;
    }

    @Override
    public void execute() {
        this.zoo.addLion(this.lion);
    }
}
