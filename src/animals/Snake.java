
package animals;
public class Snake extends Animal {
    private final int snakeLength;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Snake";
    private final int countExtremity = 0;

    public Snake(int age, int weight, int snakeLength) {
        super(age, weight);
        this.snakeLength = snakeLength;
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
        return "This snake has: " +
                "Snake Length - " + snakeLength +
                ", age - " + age +
                ", weight - " + weight + "\n";
    }
}
