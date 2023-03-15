package terminal.logging;

import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.Command;
import terminal.communicate.inputData.CommandText;
import terminal.production.CommandExecutableFactoryText;
import zoo.Zoo;

public class LoggingCommandExecutableFactoryText extends CommandExecutableFactoryText {
    @Override
    public CommandExecutable create(Command command, Zoo zoo) {
        System.out.println("Поступило животное: " + ((CommandText) command).getAnimal() +
                "\nТекущее состояние зоопарка: ");
        zoo.showCount();

        CommandExecutable executable = super.create(command, zoo);
        System.out.println("Successful end of operation. \n");

        return executable;
    }
}
