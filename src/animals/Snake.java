
package animals;
public class Snake extends Animal {
    private int lenght;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Snake";


    public Snake(int age, int weight, int countExtremity, int lenght) {
        super(age, weight, countExtremity);
        this.lenght = lenght;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}