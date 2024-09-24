package DiceGame;

public class Player {
    private String name;
    private int score;
    private int dice;

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

    public int rollDice(){
        if (Die != null) {
            return Die.getCurrentValue();
        }
    }
}
