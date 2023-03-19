package terminal.communicate.output;

import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.Command;
import terminal.communicate.menus.MenuText;
import terminal.processing.CommandParser;
import terminal.production.CommandExecutableFactory;
import zoo.Zoo;

import java.util.Scanner;

public class OutputWords implements OutputVariety {
    public OutputWords() {
    }

    @Override
    public void printMenuText(CommandExecutableFactory executableFactory,
                              CommandParser commandParser, Zoo zoo) {
        Scanner scanner = new Scanner(System.in);
        MenuText.menuStartText();
        while (true) {
            String answer = scanner.nextLine();
            if (answer.contains("exit")) break;

            Command command = commandParser.parseCommand(answer);
            CommandExecutable executable = executableFactory.create(command, zoo);
            executable.execute();

            System.out.println("__________________________________________________");
            System.out.println("Текущее состояние: ");
            zoo.showCount();
            MenuText.menuContinue();
        }
        scanner.close();
    }
}
