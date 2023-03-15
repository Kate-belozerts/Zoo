package terminal.processing;

import terminal.communicate.inputData.Command;

/**
 * Work with input text and return filled variable - CommandParser
 */
public interface CommandParser {
    <T extends Command> Command parseCommand(String inputCommand);
}
