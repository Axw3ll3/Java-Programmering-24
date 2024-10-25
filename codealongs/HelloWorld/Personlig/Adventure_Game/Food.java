package Adventure_Game;
import java.util.Random;

public class Food {
    private boolean isPoisonous;
    int intelligence;
    int health = 3;
    int strength;
    Random r = new Random();
    int random = r.nextInt(2);
    Slowprint slowprint = new Slowprint();


    public Food() {
        this.isPoisonous=isPoisonous;
    }

    public void findingTheFood() {
    slowprint.slowPrintln("In the silent, dusty policestation, you finally solve the puzzle. With a soft click, a small hidden compartment opens up beneath your feet. \nInside were a few cans of beans. \nDo you want to eat the beans?");
    }

    public void eatingTheFood() {
        int random = r.nextInt();
        if (random == 1) {
            isPoisonous = true;
            health -= 1;
            slowprint.slowPrintln("The beans you found are poisonous, and this make you lose -1 Healthpoint. You still got " +health+ " left.");
            //Metod check för om spelaren dör
            //Metod för att ta sig vidare
        }
        else if (random == 2) {
            isPoisonous = false;
            slowprint.slowPrintln("You've found yourself some fresh beans, which makes your strenght go up by 1 due to you getting new energy.");
            strength +=1;
            //Metod för att ta sig vidare
        }
    }

    public void notEatingTheFood() {
        intelligence +=1;
        slowprint.slowPrintln("Smart choice to not eat food in an abandoned policestation, this makes you gain +1 in intelligence.");
        //Metod för att ta sig vidare
        
    }

}
