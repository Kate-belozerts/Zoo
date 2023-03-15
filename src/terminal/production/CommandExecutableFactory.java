package terminal.production;

import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.Command;
import zoo.Zoo;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command, Zoo zoo);
}
