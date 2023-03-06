package terminal.processing;

import terminal.communicate.inputData.CommandNumber;
import terminal.communicate.inputData.CommandText;

/**
 * Work with input text and return filled variable - CommandParser
 */
public interface CommandParser {
    //    CommandNumber parseCommand(String inputCommand);
    CommandText parseCommand(String inputCommand);

}
