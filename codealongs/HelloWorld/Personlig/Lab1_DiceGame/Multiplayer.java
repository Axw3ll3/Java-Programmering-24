package Lab1_DiceGame;
import java.util.ArrayList;
import java.util.Scanner;

public class Multiplayer {
    private static ArrayList<Player> initialize() {
    Scanner scanner = new Scanner (System.in);

        System.out.println("Hur många spelare ska spela?");
        int numberOfPlayers = scanner.nextInt();
        
        System.out.println("Hur många tärningar ska varje spelare ha?");
        int numberOfDices = scanner.nextInt();

        System.out.println("Hur många sidor ska tärningarna ha?");
        int sides = scanner.nextInt();

        ArrayList<Player> players = new ArrayList<>();

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println("Ange namnet på spelare " +i+ ": ");
            String playerName = scanner.next();
            Player player = new Player (playerName);

        
            for (int j = 0; j < numberOfDices; j++) {
                player.addDie(sides);
            }
            players.add(player);
        }
        return players;
    }
}