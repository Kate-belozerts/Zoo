package terminal.production;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import terminal.allExecute.CommandExecutable;
import terminal.allExecute.create.CreateLion;
import terminal.allExecute.create.CreateSnake;
import terminal.allExecute.create.CreateWolf;
import terminal.allExecute.delete.DeleteAnimalExecutable;
import terminal.communicate.inputData.CommandText;
import zoo.Zoo;

/**
 * Execute the method depending on user's request
 */
public class CommandExecutableFactoryText {

    public CommandExecutable create(CommandText command, Zoo zoo) {
        if (command.isAdd()) {
            switch (command.getAnimal()) {
                case "lion" -> {
                    return new CreateLion(zoo, new Lion(command.getParameters().get("age"),
                            command.getParameters().get("weight"), command.getParameters().get("volume"),
                            command.getParameters().get("limbs")));
                }
                case "wolf" -> {
                    return new CreateWolf(zoo, new Wolf(command.getParameters().get("age"),
                            command.getParameters().get("weight"), command.getParameters().get("limbs")));
                }
                case "snake" -> {
                    return new CreateSnake(zoo, new Snake(command.getParameters().get("age"),
                            command.getParameters().get("weight"), command.getParameters().get("length")));
                }
            }
        } else return new DeleteAnimalExecutable(zoo);
        return null;
    }
}
