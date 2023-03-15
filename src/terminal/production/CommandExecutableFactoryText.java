package terminal.production;

import terminal.allExecute.CommandExecutable;
import terminal.allExecute.create.CreateLion;
import terminal.allExecute.create.CreateSnake;
import terminal.allExecute.create.CreateWolf;
import terminal.allExecute.delete.DeleteAnimalExecutable;
import terminal.communicate.inputData.Command;
import terminal.communicate.inputData.CommandText;
import zoo.Zoo;

import java.util.EmptyStackException;

/**
 * Execute the method depending on user's request
 */
public class CommandExecutableFactoryText implements CommandExecutableFactory {

    public CommandExecutable create(Command command, Zoo zoo) {
        if (command.isCreate()) {
            switch (((CommandText) command).getAnimal()) {
                case "lion" -> {
                    CreateLion res = new CreateLion(zoo);
                    res.lionParameters((CommandText) command);
                    return res;
                }
                case "wolf" -> {
                    CreateWolf res = new CreateWolf(zoo);
                    res.wolfParameters((CommandText) command);
                    return res;
                }
                case "snake" -> {
                    CreateSnake res = new CreateSnake(zoo);
                    res.snakeParameters((CommandText) command);
                    return res;
                }
            }
        } else if (command.isDelete()) return new DeleteAnimalExecutable(zoo);
        throw new EmptyStackException();
    }
}
