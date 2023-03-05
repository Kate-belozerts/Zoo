package terminal.production;

import terminal.allExecute.CommandExecutable;
import terminal.allExecute.create.CreateAnimalExecutable;
import terminal.allExecute.delete.DeleteAnimalExecutable;
import terminal.communicate.inputData.CommandNumber;
import zoo.Zoo;


public class CommandExecutableFactoryInt {

    public CommandExecutable create(CommandNumber command, Zoo zoo) {
        CommandExecutable commandExecutable = null;
        if (command.isCreate()) {
            commandExecutable = new CreateAnimalExecutable(zoo);
        } else if (command.isDelete()) {
            commandExecutable = new DeleteAnimalExecutable(zoo);
        }
        return commandExecutable;
    }
}
