package animals;

public class Wolf extends Animal {
    protected static final int MAX_WEIGHT = 90;
    protected static final String TYPE = "Wolf";


    public Wolf(int countExtremity, int age, int weight) {
        super(countExtremity, age, weight);
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
        return "Wolf: " +
                "Extremity - " + countExtremity +
                ", age - " + age +
                ", weight - " + weight + "\n";
    }
}
