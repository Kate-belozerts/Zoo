package terminal.communicate.inputData;

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

    public boolean isCreate() {
        return action == 1;
    }

    public boolean isDelete() {
        return action == 2;
    }
}
