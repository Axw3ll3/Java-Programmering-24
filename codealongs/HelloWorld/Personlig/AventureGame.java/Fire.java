package AventureGame.java;

public class Fire {
    private boolean isLit;
    private String choice;

    public Fire() {
        this.isLit = false;
    }

    public void askToLight() {
        //Metod för att hämta valmeny

    }

    public void ifYes() {
        isLit = true;
        System.out.println("You've decided to start the fire");
        intelligence += 1;
        System.out.println("You've also gotten a skillpoint for intelligence.");
        System.out.println("Unfortunally, you attracted spiders");
        //Metod för att kalla på spindlar
    }
    public void ifNo() {
        isLit = false;
        System.out.println("Due to you not putting up the fire, you've gotten cold and lost a healthpoint.");
        health -=1;

    }
}