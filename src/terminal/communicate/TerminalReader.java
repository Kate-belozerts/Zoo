package terminal.communicate;

import terminal.communicate.output.OutputDigit;
import terminal.communicate.output.OutputWords;
import terminal.production.CommandExecutableFactoryInt;
import terminal.production.logging.LoggingCommandExecutableFactoryInt;
import terminal.production.logging.LoggingCommandExecutableFactoryText;
import terminal.production.CommandExecutableFactory;
import terminal.processing.CommandParser;
import terminal.production.CommandExecutableFactoryText;
import zoo.Zoo;

/**
 * Variable with 3 fields to communicate with user. Create zoo inside and working with input text.
 */
public class TerminalReader extends CommandExecutableFactoryText {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;
    private final Zoo zoo;

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory, Zoo zoo) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
        this.zoo = zoo;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser, int choice) {
        if (terminalReader == null) {
            Zoo zoo = new Zoo();
            CommandExecutableFactory commandExecutableFactory;
            if (choice == 1) {
                commandExecutableFactory = new LoggingCommandExecutableFactoryInt();
            } else commandExecutableFactory = new LoggingCommandExecutableFactoryText();
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory, zoo);
        }
        return terminalReader;
    }

    public void endless() {
        if (commandExecutableFactory instanceof CommandExecutableFactoryInt) {
            new OutputDigit().printMenuText(this.commandExecutableFactory, this.commandParser,
                    this.zoo);
        } else new OutputWords().printMenuText(this.commandExecutableFactory, this.commandParser,
                this.zoo);
    }

    public Zoo getZoo() {
        return zoo;
    }
}
