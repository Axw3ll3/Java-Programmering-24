package dicegame;
import java.util.Scanner;

public class DiceGame {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int rounds = scanner.nextInt();

        String playerName = scanner.next();

        int sides = scanner.nextInt();

        Player player = new Player(playerName);

        for (int i = 1; i<=rounds; i++) {
            System.out.println("\nOmgång " + i);

            int guess = scanner.nextInt();

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
        System.out.println("\nSpelet är över! " + player.getName() + " du fick totalt:" +player.getScore() + " poäng.");

    }
}