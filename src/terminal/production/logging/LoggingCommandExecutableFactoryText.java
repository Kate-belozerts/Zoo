package terminal.production.logging;

import terminal.allExecute.CommandExecutable;
import terminal.allExecute.EmptyCommandExecutable;
import terminal.communicate.inputData.Command;
import terminal.communicate.inputData.CommandText;
import terminal.production.CommandExecutableFactoryText;
import zoo.Zoo;

public class LoggingCommandExecutableFactoryText extends CommandExecutableFactoryText {
    @Override
    public CommandExecutable create(Command command, Zoo zoo) {
        System.out.println("Поступило животное: " + ((CommandText) command).getTypeAnimal() +
                "\nТекущее состояние зоопарка: ");
        zoo.showCount();

        CommandExecutable executable = super.create(command, zoo);
        if (executable instanceof EmptyCommandExecutable) {
            System.out.println("Вы что-то не то ввели...");
        } else System.out.println("Successful end of operation. \n");

        return executable;
    }
}
