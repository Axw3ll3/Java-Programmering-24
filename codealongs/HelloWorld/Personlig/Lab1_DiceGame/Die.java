package Lab1_DiceGame;
import java.util.Random;

public class Die {
    //Privat klassvariabel för slumpgenerator
    private static Random random = new Random();
    
    //Instansvariabler
    private int currentValue;
    private int sides;

    //Konstruktor som sätter antal sidor
    public Die(int sides) {
        this.sides=sides;
        this.currentValue=1;
    }

    //Getter metod för antal sidor
    public int getSides(){
        return sides;
    }

    //Getter metod för nuvarande värde
    public int getCurrentValue(){
        return currentValue;
    }

    //Roll()-metod som genererar ett slumpmässigt värde
    public void roll(){
        currentValue=random.nextInt(sides) + 1;
    }

}

