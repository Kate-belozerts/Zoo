package terminal.communicate.inputData;

/**
 * Variable to work with numbers from terminal. Has action number and input text
 */
public class CommandNumber {
    private final String input;
    private final int action;

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
        return action == 1;
    }

    /**
     * True if user chose delete an animal
     */
    public boolean isDelete() {
        return action == 2;
    }
}
