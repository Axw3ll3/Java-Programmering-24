package Lab1_DiceGame;
import java.util.Random;

public class Die {
    private static Random random = new Random();

    private int currentValue;
    private int sides;

    public Die(int sides) {
        this.sides=sides;
        this.currentValue=1;
    }

    public int getSides(){
        return sides;
    }

    public int getCurrentValue(){
        return currentValue;
    }

    public void roll(){
        currentValue=random.nextInt(sides);
    }

}

