package terminal.allExecute.delete;

import animals.Lion;
import terminal.allExecute.CommandExecutable;
import zoo.Zoo;

public class DeleteLion implements CommandExecutable {
    private Zoo zoo;
    @Override
    public void execute() {
        this.zoo.pickLionFromCage();
    }
}
