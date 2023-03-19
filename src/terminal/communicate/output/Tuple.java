package terminal.communicate.output;

import terminal.processing.CommandParser;

public record Tuple(int number, CommandParser commandParser) {
}


// Оставила свой вариант для себя, идея переделала в рекорд
//public class Tuple {
//    private final int number;
//    private final CommandParser commandParser;
//
//    public Tuple(int number, CommandParser commandParser) {
//        this.number = number;
//        this.commandParser = commandParser;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public CommandParser getCommandParser() {
//        return commandParser;
//    }
//}
