package DiceGame;
import java.util.Random;

public class Die {
    private int currentValue;
    private int sides;
    private Random random = new Random();

    public Die(int sides) {
        this.sides=sides;

    }
    
    public int getSides(int sides) {
        return sides;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void roll() {
        currentValue = random.nextInt(sides) + 1;
    }
}
 