package terminal.communicate;

import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.Command;
import terminal.communicate.menus.MenuText;
import terminal.logging.LoggingCommandExecutableFactoryText;
import terminal.production.CommandExecutableFactory;
import terminal.processing.CommandParser;
import terminal.production.CommandExecutableFactoryText;
import zoo.Zoo;

import java.util.Scanner;

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

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            Zoo zoo = new Zoo();
            CommandExecutableFactory commandExecutableFactory = new LoggingCommandExecutableFactoryText();
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory, zoo);
        }
        return terminalReader;
    }

    public void endless() {
        Scanner scanner = new Scanner(System.in);
        MenuText.menuStartText();
        while (true) {
            String answer = scanner.nextLine();
            if (answer.contains("exit")) break;

            Command command = this.commandParser.parseCommand(answer);
            CommandExecutable result = this.commandExecutableFactory.create(command, this.zoo);
            result.execute();
            zoo.showCount();
            MenuText.menuContinue();
        }
        scanner.close();
    }

    public Zoo getZoo() {
        return zoo;
    }
}
