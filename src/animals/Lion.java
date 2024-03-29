/*Создать в классе Lion и Snake статичные финальные поля MAX_WEIGHT и TYPE и на той же строке объявления присвоить им значения.
Добавить логику в метод feed, чтобы животное не могло превысить свой максимальный вес.
*3.   Реализовать логику так, чтобы метод feed находился в классе Animal и использовал внутри себя абстрактный метод
 */

package animals;

/**
 * Animal lion has age, weight, volume and in general 4 extremity.
 * His maximal weight is 200 kg
 */

public class Lion extends Animal {
    private final int volume;
    private final int countExtremity;
    protected static final int MAX_WEIGHT = 200;
    protected static final String TYPE = "Lion";


    public Lion(int age, int weight, int volume, int countExtremity) {
        super(age, weight);
        this.volume = volume;
        this.countExtremity = countExtremity;
    }

    /**
     * @return volume of lion's mane
     */
    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Lion: " +
                "Volume of mane - " + volume +
                ", Extremity - " + countExtremity +
                ", age - " + age +
                ", weight - " + weight + "\n";
    }
}
