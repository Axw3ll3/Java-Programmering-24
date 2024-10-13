package Lab1_DiceGame;
import java.util.ArrayList;

public class Player {
    private String name;
    private int score;
    private ArrayList<Die> dice;

    public Player(String name) {
        this.name=name;
        this.score=0;
        this.dice = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = 1;
    }

    public void increaseScoreBy(int value) {
        score += 1;
    }

    public void rollAllDice(){
        for (Die die : dice) {
            die.roll();
        }
    }

    public ArrayList<Integer> getAllDieValue () {
        ArrayList<Integer> values = new ArrayList<>();
        for (Die die : dice) {
            values.add(die.getCurrentValue());
        }
        return values;
    }

    public void addDie(int sides) {
        this.dice.add(new Die (sides));
    }


}

