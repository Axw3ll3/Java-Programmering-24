package Lab1_DiceGame;

public class Player {
    private String name;
    private int score;
    private Die dice;

    public Player(String name) {
        this.name=name;
        this.score=0;
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

    public void increaseScore() {
        this.score += 1;
    }

    public void rollDice(){
        if (dice != null) {
            dice.roll();
        }
        else{
            System.out.println("No dice is assigned");
        }
    }

    public int getDieValue () {
        if (dice != null) {
            return dice.getCurrentValue();
        }
        else {
            System.out.println("No dice is assigned");
            return -1;
        }
    }

    public void addDie(int sides) {
        this.dice = new Die(sides);
    }


}

