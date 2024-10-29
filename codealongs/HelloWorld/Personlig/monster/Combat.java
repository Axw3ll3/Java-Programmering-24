package monster;
import java.util.Random;
import java.util.Scanner;

public class Combat {
    private Random random = new Random();
    private Scanner sc = new Scanner(System.in);
    private int choice;

    public void combat(){

        if(selection = 1){
            while(playerHealth > 0){
                if(checkSuccess = true){
                    System.out.println(getKilledByPlayer);
                }
                else if(checkSuccess = false && playerHealth > 0){
                    System.out.println(getHitPlayer);
                    System.out.println("playerName, Would you like to try again or try to run away?");
                    System.out.println("press 1 for yes, and press 2 for run away");
                    choice = sc.nextInt();
                    
                    if(sc.nextInt() == 2){
                        System.out.println("You run away");
                        break;
                    }
                    else {
                        System.out.println("You try again");
                    }
                }
                else{
                    System.out.println(getKillPlayer);
                }

            }

        }
        else if(selection = 2){
            System.out.println("You chose to try and run away");
        }

    }

    public boolean checkSuccess(int playerStrenght, int monsterStrenght){
        int strenghtDifference = playerStrenght - monsterStrenght;
                
        double successChance;
        if (strengthDifference == 0) {
            successChance = 50.0;
        } else if (strengthDifference == 1) {
            successChance = 66.6;
        } else if (strengthDifference == 2) {
            successChance = 83.3;
        } else if (strengthDifference == -1) {
            successChance = 33.3;
        } else if (strengthDifference == -2) {
            successChance = 16.7;
        } else if (strengthDifference > 2) {
            successChance = 100.0;
        } else {
            successChance = 0.0;
        }
        
        double randomValue = random.nextDouble() * 100;
        return randomValue < successChance;
        

    }

}