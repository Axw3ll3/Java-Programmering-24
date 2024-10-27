package Adventure_Game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Riddle {
    boolean isSolved = false;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Slowprint slowprint = new Slowprint();

    public Riddle() {
        this.isSolved=isSolved;
    }

    public void arrivalAtRiddle(){
        slowprint.slowPrintln("After an epic battle with the rabiesdogs - fearsome, rabid creatures that terrorized the whole hospital - you find yourself in a (quite) empty and quiet hospital. "
        + "You navigate through the dimly lit hallways. In the horizon you spot a keypad with a display above it. "
        + "\nYou run towards it, on the display it says:");
        questionAndChoice();

    }

    public void ifRiddleSolved() {
        isSolved = true;
        //Kalla på metod för att avsluta spel och visa resultat
    }

    public void ifRiddleNotSolved(){
        //Loop för att skicka tillbaka spelaren till gåtan igen, tappa ett liv samt en check för om spelaren har några liv eller inte.
    }

    public int checkChoice (Scanner scanner){
        //Check av input så det är ett positivt nummer över 0
            int number;
            boolean firstrun = true;
            do {
    
                if(!firstrun) {slowprint.slowPrintln("Write a numberical option (1-4)!");}
                while (!scanner.hasNextInt()) {
                    
                    slowprint.slowPrintln("Write a number!");
                    
                    scanner.next(); 
                    
                }
                
                firstrun = false;
                number = scanner.nextInt();
            
            } while (number < 1 || number > 4);
            return number;
            
        }
    


        public void questionAndChoice() {
            for (int i = 0; i < 1; i++) {
                //Generation av random nummer, operator och uträkning av korrekt svar
                int num1 = random.nextInt(15) + 1, num2 = random.nextInt(15) + 1;
                String[] operators = {"+", "-", "*", "/"};
                String operator = operators[random.nextInt(4)];
                int correctAnswer = calculateAnswer(num1, num2, operator, random);
    
                //Utskrift av fråga och alternativ
                slowprint.slowPrintln("Here comes the riddle of " + num1 + " " + operator + " " + num2 + "?");
                ArrayList<Integer> options = generateOptions(correctAnswer, random);
                for (int j = 0; j < options.size(); j++) slowprint.slowPrintln((j + 1) + ". " + options.get(j));
    
                //Hämtar användarens val och kollar om det är korrekt
                slowprint.slowPrintln("Enter your choice of answer on the keypad: ");
                if (options.get(checkChoice(scanner) - 1) == correctAnswer) {
                    ifRiddleSolved();
                } else {
                    ifRiddleNotSolved();    
                }
                System.out.println();
            }
            scanner.close();
        }
    
        //Metod som räknar ut svar baserat på operator
        public static int calculateAnswer(int num1, int num2, String operator, Random random) {
            switch (operator) {
                case "+": return num1 + num2;
                case "-": return num1 - num2;
                case "*": return num1 * num2;
                case "/": num1 = num1 * num2; return num1 / num2; // Säkrar att integer division finns/fungerar
                default: return 0;
            }
        }
    
        // Metod för att generera svar och alternativ med rätt svar
        public static ArrayList<Integer> generateOptions(int correctAnswer, Random random) {
            ArrayList<Integer> options = new ArrayList<>();
            options.add(correctAnswer);
            while (options.size() < 4) {
                int wrongAnswer = correctAnswer + random.nextInt(10) - 5;
                if (!options.contains(wrongAnswer)) options.add(wrongAnswer);
            }
            Collections.shuffle(options);
            return options;
        }
}
