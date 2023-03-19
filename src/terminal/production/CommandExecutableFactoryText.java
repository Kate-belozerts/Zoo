package terminal.production;

import terminal.allExecute.CommandExecutable;
import terminal.allExecute.EmptyCommandExecutable;
import terminal.allExecute.create.CreateLion;
import terminal.allExecute.create.CreateSnake;
import terminal.allExecute.create.CreateWolf;
import terminal.allExecute.delete.DeleteAnimalExecutable;
import terminal.communicate.inputData.Command;
import terminal.communicate.inputData.CommandText;
import zoo.Zoo;

/**
 * Execute the method depending on user's request
 */
public class CommandExecutableFactoryText implements CommandExecutableFactory {

    public CommandExecutable create(Command command, Zoo zoo) {
        if (command.isCreate()) {
            String animal = ((CommandText) command).getTypeAnimal();
            switch (animal) {
                case "lion" -> {
                    return new CreateLion(zoo, (CommandText) command);
                }
                case "wolf" -> {
                    return new CreateWolf(zoo, (CommandText) command);
                }
                case "snake" -> {
                    return new CreateSnake(zoo, (CommandText) command);
                }
            }
        } else if (command.isDelete()) return new DeleteAnimalExecutable(zoo);
        return new EmptyCommandExecutable();
    }
}
