package Lab1_DiceGame;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiplayerDiceGame {

    public static void playGame() { 
        //Metod för att starta spelet, samt prompts med förklaringar för spelaren vad dem ska göra
        ArrayList<Player> players = initialize();
        

        //Fråga om hur många omgångar som ska spelas
        Scanner scanner = new Scanner (System.in); 
        System.out.println("Hur många omgångar vill ni spela?");
        int rounds = checkNumber(scanner);

        //Kör spelet under angivet antal omgångar
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\n--- Omgång " +i+ "---");
            takeTurn(players);
        }

        //Visar slutresultat och vinnare
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
    
    //Metod för att initialisera spelet och skapa spelare
    private static ArrayList<Player> initialize() { //
        Scanner scanner = new Scanner (System.in);

        //Fråga om antalet spelare
        System.out.println("Hur många spelare ska spela?");
        int numberOfPlayers = checkNumber(scanner);
        
        //Fråga om antalet tärningar per spelare
        System.out.println("Hur många tärningar ska varje spelare ha?");
        int numberOfDices = checkNumber(scanner);

        //Frågar om antal sidor på tärning(arna)
        System.out.println("Hur många sidor ska tärningarna ha?");
        int sides = checkNumber(scanner);

        //Skapa en lista av spelare
        ArrayList<Player> players = new ArrayList<>();

        //Skapa spelare och tilldelar tärningar
        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println("Ange namnet på spelare " + i + ": ");
            String playerName = scanner.next();
            Player player = new Player (playerName);

            //Lägger till det önskade antalet tärningar till spelaren
            for (int j = 0; j < numberOfDices; j++) {
                player.addDie(sides);
            }
            players.add(player);
        }
        return players; //Returnerar listan med spelare
    }

    //Metod för att genomföra en omgång för alla spelare
    private static void takeTurn(ArrayList<Player> players) {
        for (Player player : players) {
            System.out.println(player.getName() + "'s tur:");

            //Spelaren rullar alla sina tärningar
            int totalValue = 0;
            player.rollAllDice();

            //Summera värden från alla tärningar
            for (int dieValue : player.getAllDieValue()) {
                System.out.println("Tärningen visar: " + dieValue);
                totalValue += dieValue;
            }

            //Lägger till det totala värdet till spelarens poäng
            player.increaseScoreBy(totalValue);
            System.out.println(player.getName() + " fick totalt: " +totalValue+ " poäng denna omgång. \n");
        }
    }

    //Metod för att hitta spelaren med högst poäng
    private static ArrayList<Player> getWinners(ArrayList<Player> players) {
        ArrayList<Player> winners = new ArrayList<>();
        int highestScore = 0;

        //Loop för att hitta den högsta poängen
        for (Player player : players) {
            if (player.getScore() > highestScore) {
                highestScore = player.getScore();
            }
        }

        //Lägger till alla spelare/spelaren som har den högsta poängen till vinnarna
        for (Player player : players) {
            if (player.getScore() == highestScore) {
                winners.add(player);
            }
        }
        return winners; //Returnerar en lista med vinnare
    }

    //Check av input så det är ett positivt nummer över 0
    public static int checkNumber(Scanner scanner) {
        int number;
        boolean firstrun = true;
        do {

            if(!firstrun) {System.out.println("Skriv ett positivt nummer tack!");}
            while (!scanner.hasNextInt()) {
                
                System.out.println("Skriv ett nummer tack!");
                
                scanner.next(); 
                
            }
            
            firstrun = false;
            number = scanner.nextInt();
        
        } while (number <= 0);
        return number;
        
    }
}

