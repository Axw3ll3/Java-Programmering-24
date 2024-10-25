package Adventure_Game;
import java.util.Random;

public class Food {
    private boolean isPoisinous;
    Random r = new Random();
    int random = r.nextInt(2);
    Slowprint slowprint = new Slowprint();


    public Food() {
        this.isPoisinous=isPoisinous;
    }

    public void findingTheFood() {
        slowprint.slowPrintln("You find random food");
    }

    public void eatingTheFood() {

    }

    public void notEatingTheFood() {

    }

}
