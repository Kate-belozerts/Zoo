package terminal.communicate.inputData;

import java.util.HashMap;
import java.util.Map;

/**
 * The variable with chosen animal and its parameters kept into HashMap
 */
public class CommandText implements Command {
    private final Map<String, Integer> parameters;
    private final String animal;
    private final static int ADD = 1;
    private final static int DELETE = 2;

    public CommandText(Map<String, Integer> parameters, String animal) {
        this.parameters = parameters;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Entered parameters was " + parameters;
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

    @Override
    public boolean isCreate() {
        return this.parameters.get("action").equals(ADD);
    }

    @Override
    public boolean isDelete() {
        return this.parameters.get("action").equals(DELETE);
    }

}
