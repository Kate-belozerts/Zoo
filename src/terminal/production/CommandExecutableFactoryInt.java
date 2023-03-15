package terminal.production;

import terminal.allExecute.CommandExecutable;
import terminal.allExecute.create.CreateAnimalExecutable;
import terminal.allExecute.delete.DeleteAnimalExecutable;
import terminal.communicate.inputData.Command;
import zoo.Zoo;

import java.util.EmptyStackException;

/**
 * Execute the method depending on user's request
 */
public class CommandExecutableFactoryInt implements CommandExecutableFactory {

    @Override
    public CommandExecutable create(Command command, Zoo zoo) {
        CommandExecutable commandExecutable;
        if (command.isCreate()) {
            return commandExecutable = new CreateAnimalExecutable(zoo);
        } else if (command.isDelete()) {
            return commandExecutable = new DeleteAnimalExecutable(zoo);
        }
        throw new EmptyStackException();
    }
}
