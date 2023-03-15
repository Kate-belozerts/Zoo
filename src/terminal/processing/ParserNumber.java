package terminal.processing;

import terminal.communicate.inputData.Command;
import terminal.communicate.inputData.CommandNumber;

public class ParserNumber implements CommandParser {
    @Override
    public <T extends Command> Command parseCommand(String inputCommand) {
        if (inputCommand.matches("\\d+")) {
            int result = Integer.parseInt(inputCommand);
            return new CommandNumber(inputCommand, result);
        } else return new CommandNumber(" ", 0);
    }
}
