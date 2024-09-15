import java.util.Scanner;


public class Challenges_1 {
    private Scanner sc = new Scanner (System.in);
    public void main(String[] args) {
          getANumber();



    }

public Scanner getScanner() {
    return sc;
    }


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
    /*
public int getANumber() {
    Scanner sc = getScanner();
    int Number = 0;
    System.out.println("Please, enter a number: ");
    Number = checkNumber(sc);
    Number = checkValue(Number);
    return Number;

    
}
*/

public double checkNumber(Scanner sc) {
    while (!sc.hasNextInt()) {
        System.out.println("Please write a number");
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

        else if (Number < 1) {
            System.out.println("The number is small");
        }

        else if (Number > 1000000) {
            System.out.println("The number is big");
        }

        else {
            System.out.println("Number is zero");
        }
        return Number;
    }

}

