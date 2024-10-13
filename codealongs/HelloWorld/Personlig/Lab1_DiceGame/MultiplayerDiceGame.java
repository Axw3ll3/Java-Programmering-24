package Lab1_DiceGame;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiplayerDiceGame {

    public static void playGame() {
        ArrayList<Player> players = initialize();
        
    }

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

    public void takeTurn(ArrayList<Player> players) {
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
    public ArrayList<Player> getWinners(ArrayList<Player> players) {
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

