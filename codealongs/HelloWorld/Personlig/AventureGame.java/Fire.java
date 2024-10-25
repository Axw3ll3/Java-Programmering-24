package AventureGame.java;

public class Fire {
    private boolean isLit;
    private String choice;

    public Fire() {
        this.isLit = false;
    }

    public void askToLit() {
        //Metod för att hämta valmeny

    }

    public void ifLit() {
        isLit = true;
        System.out.println("You've decided to start the fire");
        intelligence += 1;
        System.out.println("You've also gotten a skillpoint for intelligence.");
        System.out.println("Unfortunally, you attracted spiders");
        //Metod för att kalla på spindlar
    }
    public void ifNotLit() {
        isLit = false;
        System.out.println("Due to you not putting up the fire, you've gotten cold and lost a healthpoint.");
        health -=1;
        System.out.println("You've moved on without a scratch though, which let you move on to the next part of the story");
        //Metod för att ta sig vidare i historien
    }
}