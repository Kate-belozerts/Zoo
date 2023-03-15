package terminal.communicate.inputData;

import java.util.Map;

public interface Command {
    /**
     * True if user chose to create an animal
     */
    boolean isCreate();

    /**
     * True if user chose to delete an animal
     */
    boolean isDelete();
}
