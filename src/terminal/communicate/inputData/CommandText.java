package terminal.communicate.inputData;

import java.util.HashMap;
import java.util.Map;

public class CommandText {
    Map<String, Integer> parameters = new HashMap<>();
    String animal;

    public CommandText(Map<String, Integer> parameters, String animal) {
        this.parameters = parameters;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Entered parameters was " + parameters;
    }

    public boolean isAdd() {
        return this.parameters.get("action") == 1;
    }

    public Map<String, Integer> getParameters() {
        return parameters;
    }

    public String getAnimal() {
        return animal;
    }
}
