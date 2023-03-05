package terminal.processing;

import terminal.communicate.inputData.CommandNumber;
import terminal.communicate.inputData.CommandText;

public interface CommandParser {
//    CommandNumber parseCommand(String inputCommand);
    CommandText parseCommand(String inputCommand);

}
