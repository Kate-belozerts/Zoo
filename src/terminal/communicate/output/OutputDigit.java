package terminal.communicate.output;

import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.Command;
import terminal.communicate.menus.MenuNumber;
import terminal.communicate.menus.MenuText;
import terminal.processing.CommandParser;
import terminal.production.CommandExecutableFactory;
import zoo.Zoo;

import java.util.Scanner;

public class OutputDigit implements OutputVariety {
    public OutputDigit() {
    }

    @Override
    public void printMenuText(CommandExecutableFactory executableFactory, CommandParser commandParser, Zoo zoo) {
        Scanner scanner = new Scanner(System.in);
        MenuNumber.menuStartNumbers();
        while (true) {
            String answer = scanner.nextLine().trim();
            if (answer.equals("0")) break;

            Command command = commandParser.parseCommand(answer);
            CommandExecutable executable = executableFactory.create(command, zoo);
            executable.execute();

            System.out.println("____________________________________________________");
            System.out.println("Текущее состояние зоопарка: ");
            zoo.showCount();
            MenuNumber.menuStartNumbers();
        }
        scanner.close();
    }
}
