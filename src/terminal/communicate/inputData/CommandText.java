package terminal.communicate.inputData;

import java.util.HashMap;
import java.util.Map;

/**
 * The variable with chosen animal and its parameters kept into HashMap
 */
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

    /**
     * If user chose to add the animal
     */
    public boolean isAdd() {
        return this.parameters.get("action") == 1;
    }

    /**
     * @return parameters of the animal
     */
    public Map<String, Integer> getParameters() {
        return parameters;
    }

    /**
     * @return chosen animal
     */
    public String getAnimal() {
        return animal;
    }
}
