import java.util.Scanner;

public class GameEngine {
    
    public void start() {
    Scanner scanner = new Scanner(System.in);
            
            System.out.println("Select amount of rounds: ");
            int rounds = scanner.nextInt();
    
            System.out.println("Please, enter your name: ");
            String playerName = scanner.next();
            
            System.out.println("How many sides do you want the dice to have?");
            int sides = scanner.nextInt();
    
            Player player = new Player(playerName);
            player.addDie(sides);
    
            for (int i = 1; i<=rounds; i++) {
                System.out.println("\nOmgång " + i);
    
                System.out.println("Gissa ett värde mellan 1 och " +sides+ " : ");
                int guess = scanner.nextInt();
                
                player.rollDice();
                int dieValue = player.getDieValue();
                System.out.println("Tärningen visade: " +dieValue);
    
                if (guess == dieValue) {
                    player.increaseScore();
                    System.out.println("Grattis! Du fick rätt och 1 poäng");
                }
                else {
                    System.out.println("Tyvärr, du gissade fel.");
                }
            }
            System.out.println("\nSpelet är över! " + player.getName() + " du fick totalt: " +player.getScore() + " poäng.");
    
        }
}