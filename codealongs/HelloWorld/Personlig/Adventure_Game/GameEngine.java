package Adventure_Game;

public class GameEngine {
    public static void main(String[] args) {
        Slowprint slowprint = new Slowprint();
        FirePlace fire = new FirePlace();
        fire.arrivalAtFirePlace();
        System.out.println("");
        fire.ifLit();
        System.out.println("");
        fire.ifNotLit();

    }
    
}
