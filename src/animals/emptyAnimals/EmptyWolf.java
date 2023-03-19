package animals.emptyAnimals;

import animals.Wolf;

public class EmptyWolf extends Wolf {
    private static EmptyWolf emptyWolf;

    private EmptyWolf(int age, int weight, int countExtremity) {
        super(age, weight, countExtremity);
    }

    public static EmptyWolf newEmptyWolf() {
        if (emptyWolf == null) {
            emptyWolf = new EmptyWolf(0, 0, 0);
        }
        return emptyWolf;
    }

    @Override
    public String toString() {
        return "Волков нет! ";
    }
}
