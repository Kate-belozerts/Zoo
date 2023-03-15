package terminal.logging;

import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.Command;
import terminal.production.CommandExecutableFactoryInt;
import zoo.Zoo;

public class LoggingCommandExecutableFactoryInt extends CommandExecutableFactoryInt {
    @Override
    public CommandExecutable create(Command command, Zoo zoo) {
        System.out.println("Введенная команда: " + command.toString() + "\nТекущее состояние зоопарка: ");
        zoo.showCount();

        CommandExecutable executable = super.create(command, zoo);
        System.out.println("Successful end of operation. \n");
        return executable;
    }
}
