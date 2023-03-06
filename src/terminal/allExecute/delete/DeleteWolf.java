package terminal.allExecute.delete;

import terminal.allExecute.CommandExecutable;
import zoo.Zoo;

/**
 * Remove wolf from zoo
 */
public class DeleteWolf implements CommandExecutable {
    private Zoo zoo;

    @Override
    public void execute() {
        this.zoo.pickWolfFromCage();
    }
}
