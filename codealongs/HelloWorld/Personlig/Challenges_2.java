import java.util.Scanner;

public class Challenges_2 {
    private Scanner sc = new Scanner(System.in);

    public void main(String[] args) {
        
        Scanner sc = getScanner();

        System.out.println("Welcome to this simmulation, please choose an option below: ");

        System.out.println(" 1. Add two numbers. \n 2. Count the amount of characters in a string \n 3. Mirror a string \n 4. Add all numbers in a string \n 0. Shut down program");

        int choice = 0;

        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input, please write a number");
                sc.next();
            }
                System.out.println("Please write a number between 0-4");
            choice = sc.nextInt();

            

        }while (choice > 4 || choice == 0);

        sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You choose option 1");    
                    addTwoNumbers();
                    break;
            
                case 2:
                System.out.println("You choose option 2");
                countCharInString();    
                break;

                case 3:

                System.out.println("You choose option 3");
                    mirrorString();
                    break; 
                case 4:
                
                System.out.println("You choose option 4");
                    addNumbersInString();
                    break;
                
                
                case 0:
                System.out.println("You choose option 0");
                System.out.println("Shutting down program!");
                    break;
            }
    }

    public Scanner getScanner () {
        return sc;
    }

    public void addTwoNumbers(){

        int firstNumber = 0;
        int secondNumber = 0;

        System.out.println("Please choose 2 numbers to add together");

        System.out.println("First number: ");
        firstNumber = checkNumber(sc);
        System.out.println("The first number is: " + firstNumber);

        System.out.println("Second number: ");
        secondNumber = checkNumber(sc);
        System.err.println("The second number: " +secondNumber);
        

        int sum = firstNumber + secondNumber;
        System.out.println("The sum of the number are: " +sum);

    } 
    
    public void countCharInString() {
        Scanner sc = getScanner();
        System.out.println("Please write a string");
        String savedString = sc.nextLine();
        System.out.println("Please write the letter you want to search for: ");
        char C = sc.nextLine().charAt(0);
        checkCharInString(savedString, C);
        System.out.println("The letter " +C+ " was found " +checkCharInString(savedString, C)+ " amount of times");
    }


    public String mirrorString() {
        Scanner sc = getScanner();
        System.out.println("Write the word you want to mirror: ");
        String word = sc.nextLine();
        System.out.println("Mirroring word...");
        
        String noString = "";
        char characters;

        for (int i=0; i<word.length(); i++) {
            characters=word.charAt(i);
            noString = characters+noString;
        }
        
        System.out.println("The mirrored word is: " +noString);
        return noString;
    }

    public int checkNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.nextLine();
        }
            return sc.nextInt();
        }

    
    public int inputAction(){
        Scanner sc = getScanner();

        int n = 0;
        while (n < 1 || n > 5) {
            n = checkNumber(sc);
        }
        return n;
    }

    public int checkCharInString(String savedString, char C) {
    int count = 0;
    
    for(int i=0; i<savedString.length(); i++) {
        if (savedString.charAt(i) == C) {
            count++;
        } 
        }
        return count;
    }
   
    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }  
    
    public void addNumbersInString() {
    Scanner sc = getScanner();
    System.out.println("Pleasae enter a string of numbers: ");

    String inputString = sc.nextLine();
    int sum = 0;

    for (int i = 0; i<inputString.length(); i++) {
        char c = inputString.charAt(i);

        if (!isDigit(c)) {
            System.out.println("This string contains a letter, please input a string of only numbers!");
            return;
        }
        sum += c - 48;
    }
    System.out.println("The total sum of the number in the string is: " + sum);
}
    
    
}