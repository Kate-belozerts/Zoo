package animals.emptyAnimals;

import animals.Lion;

public class EmptyLion extends Lion {
    private static EmptyLion emptyLion;
    private EmptyLion(int age, int weight, int volume, int countExtremity) {
        super(age, weight, volume, countExtremity);
    }
    public static EmptyLion newEmptyLion(){
        if (emptyLion == null){
            emptyLion = new EmptyLion(0, 0, 0, 0);
        }
        return emptyLion;
    }

    @Override
    public String toString() {
        return "Львов нет!\n";
    }
}
