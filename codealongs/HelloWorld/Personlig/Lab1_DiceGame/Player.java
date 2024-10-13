package Lab1_DiceGame;
import java.util.ArrayList;

public class Player {
    //Instansvariabler
    private String name;
    private int score;
    private ArrayList<Die> dice;

    //Konstruktor
    public Player(String name) {
        this.name=name;
        this.score=0;
        this.dice = new ArrayList<>();//Skapar en tom lista för tärningar
    }

    //Getter metod för namn
    public String getName() {
        return name;
    }

    //Getter och setter metod för poäng
    public int getScore() {
        return score;
    }

    //Öka poäng med ett specifikt värde
    /* Inte relevant i senare version av spel
    public void setScore(int score) {
        this.score = 1;
    }
    */

    //Öka poäng med specifikt värde
    public void increaseScoreBy(int value) {
        score += value;
    }

    //Rulla alla träningar
    public void rollAllDice(){
        for (Die die : dice) {
            die.roll();
        }
    }

    //Hämta värderna från alla träningar
    public ArrayList<Integer> getAllDieValue () {
        ArrayList<Integer> values = new ArrayList<>();
        for (Die die : dice) {
            values.add(die.getCurrentValue());
        }
        return values;
    }

    //Lägg till en tärning till spelaren
    public void addDie(int sides) {
        this.dice.add(new Die (sides));
    }


}

