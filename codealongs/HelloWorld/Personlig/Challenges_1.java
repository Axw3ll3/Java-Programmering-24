import java.util.Scanner;


public class Challenges_1 {
    private Scanner sc = new Scanner (System.in);
    public void main(String[] args) {
        diamondPyramid();
        
        
        
    }
    
    public Scanner getScanner() {
        return sc;
    }
    
    /*
    public void getNumbers() {
    System.out.println("Please enter 3 numbers: ");
    System.out.println("Number 1: ");
    double firstNumber = checkNumber(sc);
    System.out.println("Number 2: ");
    double secondNumber = checkNumber(sc);
    System.out.println("Number 3: ");
    double thirdNumber = checkNumber(sc);
    
    
    
    }
    */
    
    /*
    public int getANumber() {
    Scanner sc = getScanner();
    int Number = 0;
    System.out.println("Please, enter a number you want to see multiplication on: ");
    Number = checkNumber(sc);
    Number = multiplicationConverter(Number);
    return Number;
    
    
    }
    */
    
    public int checkNumber(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Please write a number");
            sc.nextLine();
        }
        return sc.nextInt();
    }
    
    /*
    public double checkValue(double Number) {
    
    if (Number == 0) {
    System.out.println("The number is zero");
    }
    
    else if (Number > 0) {
    System.out.println("The number is positive");
    }
    
    else if (Number < 0) {
    System.out.println("The number is small and negative");
    }
    
    else if (Number > 1000000) {
    System.out.println("The number is big and positive");
    }
    
    
    return Number;
    }
    */  
    
    /*
    public int convertNumberToDay(int Number) {
    
    if (Number == 1) {
    System.out.println("Monday");
    }
    
    else if (Number == 2) {
    System.out.println("Tuesday");
    }
    
    else if (Number == 3) {
    System.out.println("Wednesday");
    }
    
    else if (Number == 4) {
    System.out.println("Thursday");
    }
    
    else if (Number == 5) {
    System.out.println("Friday");
    }
    
    else if (Number == 6) {
    System.out.println("Saturday");
    }
    
    else if (Number == 7) {
    System.out.println("Sunday");
    }
    
    return Number;
    }
    */
    
    /* 
    public int multiplicationConverter(int Number) {
    for (int i = 0; i<10; i++) {
    System.out.println(Number + " x " + (i + 1) + " = " + (Number * (i + 1)));
    
    }
    return Number;
    }
    */
    
    
    /*
    public void halfPyramidOfNumbers() {
    System.out.println("How many rows of the pyramid do you want?");
    int nrOfRows = sc.nextInt();
    
    int rowCount = 1;
    System.out.println("Here's your pyramid");
    
    for (int i = nrOfRows; i > 0; i--) {
    for (int j = 1; j<=i; j++) {
    System.out.print(" ");
    }
    
    for (int j = 1; j<=rowCount; j++) {
    System.out.print(rowCount + " ");
    }
    System.out.println();
    
    rowCount++;
    
    }
    
    }
    */
    
    public void diamondPyramid() {
        int nrOfRows = sc.nextInt();
        int n, m;
        
        for (m = 1; m<=nrOfRows; m++) {
            System.out.print(" ");
        }
        
        for (n = 1; n<=m*2-1;n++) {
            System.out.print("*");
        }
        
        System.out.println();
    

    for (m = nrOfRows - 1; m>0; m--) {
        for (n=1; n<=nrOfRows-m; n++) {
            System.out.print(" ");
        }
        for (n = 1; n<=m*2-1; n++) {
            System.out.print("*");
            
        }
        System.out.println();
        }
    }
}
