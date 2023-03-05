package terminal.communicate;

import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import terminal.allExecute.CommandExecutable;
import terminal.communicate.inputData.CommandNumber;
import terminal.communicate.inputData.CommandText;
import terminal.communicate.menus.menuNumber;
import terminal.communicate.menus.menuText;
import terminal.production.CommandExecutableFactoryInt;
import terminal.processing.CommandParser;
import terminal.production.CommandExecutableFactoryText;
import zoo.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class TerminalReader extends CommandExecutableFactoryInt {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final Zoo zoo;

    private TerminalReader(CommandParser commandParser, Zoo zoo) {
        this.zoo = zoo;
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            Zoo zoo = new Zoo(new WolfCage(new ArrayList<>()), new LionCage(new ArrayList<>()),
                    new SnakeCage(new ArrayList<>()));
            terminalReader = new TerminalReader(commandParser, zoo);
        }
        return terminalReader;
    }

//    public void endless() {  // Ввод цифр
//        menuNumber.menuStartNumbers();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            String answer = scanner.nextLine().trim();
//            if (answer.equals("0")) break;
//            System.out.println("Сейчас в зоопарке: ");
//            zoo.showCount();
//
//            CommandNumber commandNumber = this.commandParser.parseCommand(answer);
//            CommandExecutable result = new CommandExecutableFactoryInt().create(commandNumber, this.zoo);
//            result.execute();
//
//            System.out.println("Стало: ");
//            zoo.showCount();
//
//        }
//        scanner.close();
//    }

    public void endless() { // Ввод текстом
        menuText.menuStartText();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.contains("exit")) break;
            System.out.println("Сейчас в зоопарке: ");
            zoo.showCount();

            CommandText commandText = this.commandParser.parseCommand(answer);
            CommandExecutable result = new CommandExecutableFactoryText().create(commandText, this.zoo);
            result.execute();

            System.out.println("Стало: ");
            zoo.showCount();
        }
        scanner.close();
    }

    public Zoo getZoo() {
        return zoo;
    }
}
