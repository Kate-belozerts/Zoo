package terminal.logging;

import terminal.communicate.inputData.CommandNumber;
import terminal.allExecute.CommandExecutable;
import terminal.production.CommandExecutableFactoryInt;
import zoo.Zoo;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryInt {
    @Override
    public CommandExecutable create(CommandNumber command, Zoo zoo) {
        System.out.println(command.toString());
        CommandExecutable printExe = super.create(command, zoo);
        System.out.println("end");
        return printExe;
    }
}
