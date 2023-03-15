package terminal.communicate.inputData;

import java.util.Map;

/**
 * Variable to work with numbers from terminal. Has action number and input text
 */
public class CommandNumber implements Command {
    private final String input;
    private final int action;
    private static final int ADD = 1;
    private static final int DELETE = 2;

    public CommandNumber(String input, int action) {
        this.input = input;
        this.action = action;
    }

    @Override
    public String toString() {
        return "Command was " + input;
    }

    /**
     * True if user chose create an animal
     */
    public boolean isCreate() {
        return action == ADD;
    }

    /**
     * True if user chose delete an animal
     */
    public boolean isDelete() {
        return action == DELETE;
    }
}
