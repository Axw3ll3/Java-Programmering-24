package Adventure_Game;

public class Fire {
    private boolean isLit;
    private String choice;

    public Fire() {
        this.isLit = false;
    }

    public void arrivalAtFirePlace(){
        //Historia när spelaren anländer
    }

    public void askToLit() {
        //Metod för att hämta valmeny

    }

    public void ifLit() {
        isLit = true;
        Slowprint slowprint = new Slowprint();
        slowprint.slowPrintln("You've decided to start the fire", 50);
        intelligence += 1;
        slowprint.slowPrintln("You've also gotten a skillpoint for intelligence.", 50);
        System.out.println("Unfortunally, you attracted spiders");
        //Metod för att kalla på spindlar
    }
    public void ifNotLit() {
        Slowprint slowprint = new Slowprint();
        isLit = false;
        slowprint.slowPrintln("Due to you not putting up the fire, you've gotten cold and lost a healthpoint.");
        health -=1;
        slowprint.slowPrintln("You've moved on without a scratch though, which let you move on to the next part of the story");
        //Metod för att ta sig vidare i historien
    }
}