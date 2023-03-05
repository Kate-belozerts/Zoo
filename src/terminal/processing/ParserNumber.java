//package terminal.processing;
//
//import terminal.communicate.inputData.CommandNumber;
//
//public class ParserNumber implements CommandParser {
//    @Override
//    public CommandNumber parseCommand(String inputCommand) {
//        if (inputCommand.matches("\\d+")) {
//            int result = Integer.parseInt(inputCommand);
//            return new CommandNumber(inputCommand, result);
//        } else return null;
//    }
//}
