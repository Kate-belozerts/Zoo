package terminal.communicate.output;

import terminal.processing.CommandParser;
import terminal.production.CommandExecutableFactory;
import zoo.Zoo;

public interface OutputVariety {
    void printMenuText(CommandExecutableFactory executableFactory,
                                     CommandParser commandParser, Zoo zoo);
}
