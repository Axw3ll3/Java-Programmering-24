package Lab1_DiceGame;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiplayerDiceGame {

    public static void playGame() { //Metod för att starta spelet, samt prompts med förklaringar för spelaren vad dem ska göra
        ArrayList<Player> players = initialize();
        
        Scanner scanner = new Scanner (System.in); 
        System.out.println("Hur många omgångar vill ni spela?");
        int rounds = scanner.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.println("\n--- Omgång " +i+ "---");
            takeTurn(players);
        }

        ArrayList<Player> winners = getWinners(players);
        System.out.println("\n--- Spelet är över ---");
        System.out.println("Slutliga poäng:");
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getScore() + " poäng");
        }
        
        System.out.println("\nVinnare: ");
        for (Player winner : winners) {
            System.out.println(winner.getName());
        }

    }
    
    private static ArrayList<Player> initialize() { //
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

    public static void takeTurn(ArrayList<Player> players) {
        for (Player player : players) {
            System.out.println(player.getName() + "'s tur:");

            int totalValue = 0;
            player.rollAllDice();

            for (int dieValue : player.getAllDieValue()) {
                System.out.println("Tärningen visar: " + dieValue);
                totalValue += dieValue;
            }
            player.increaseScoreBy(totalValue);
            System.out.println(player.getName() + " fick totalt: " +totalValue+ " poäng denna omgång. \n");
        }
    }
    public static ArrayList<Player> getWinners(ArrayList<Player> players) {
        ArrayList<Player> winners = new ArrayList<>();
        int highestScore = 0;

        for (Player player : players) {
            if (player.getScore() > highestScore) {
                highestScore = player.getScore();
            }
        }

        for (Player player : players) {
            if (player.getScore() == highestScore) {
                winners.add(player);
            }
        }
        return winners;
    }
}

