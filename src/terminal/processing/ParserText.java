package terminal.processing;

import terminal.communicate.inputData.CommandText;

import java.util.HashMap;
import java.util.Map;


public class ParserText implements CommandParser {
    @Override
    public CommandText parseCommand(String inputCommand) {
        Map<String, Integer> param = new HashMap<>();
        String animal = null;
        if (inputCommand.contains("del")) {
            param.put("action", 2);
            return new CommandText(param, animal);
        }
        String[] input = inputCommand.toLowerCase().split(",");
        animal = input[1].trim();

        for (String s : input) {
            if (s.matches("\\d+")) param.put("action", Integer.valueOf(s));

            else if (s.contains("years")) {
                String[] temp = s.split(" ");
                param.put("age", Integer.valueOf(temp[1]));
            } else if (s.contains("kg")) {
                String[] temp = s.split(" ");
                param.put("weight", Integer.valueOf(temp[1]));
            } else if (s.contains("volume")) {
                String[] temp = s.split(" ");
                param.put("volume", Integer.valueOf(temp[1]));
            } else if (s.contains("limbs")) {
                String[] temp = s.split(" ");
                param.put("limbs", Integer.valueOf(temp[1]));
            } else if (s.contains("length")) {
                String[] temp = s.split(" ");
                param.put("length", Integer.valueOf(temp[1]));
            }
        }
        return new CommandText(param, animal);
    }
}
