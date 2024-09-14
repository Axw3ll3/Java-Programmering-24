import java.util.Scanner;
import javax.print.attribute.standard.NumberOfDocuments;

public class Challenges_1 {
    private Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
            
    }

public Scanner getScanner() {
    return sc;
    }

/*
public double getNumbers() {
    System.out.println("Please enter 3 numbers: ");
    System.out.println("Number 1: ");
    double firstNumber = sc.nextDouble();
    System.out.println("Number 2: ");
    double secondNumber = sc.nextDouble();
    System.out.println("Number 3: ");
    double thirdNumber = sc.nextDouble();
    return 
    
}
    */
public int getANumber() {
    Scanner sc = getScanner();
    System.out.println("Please, enter a number: ");
    int Number = sc.nextInt();
    Number = checkNumber(sc);
    Number = checkValue();
    return Number;

    
}


public int checkNumber(Scanner sc) {
    while (!sc.hasNextInt()) {
        sc.nextLine();
    }
        return sc.nextInt();
    }

    public int checkValue(int Number) {

        if (Number > 0) {
            System.out.println("The number is positive");
        }

        else if (Number < 0) {
            System.out.println("The number is negative");
        }

        else {
            System.out.println("Number is zero");
        }
        return Number;
    }

}

