package Challenge_3_and_classes;

public class Factorial {
private int number;

public calculateFactorial(int number) {
    if (number == 0) {
        return 1;
    }
    else {
        return (number*factorial(number-1));
    }
}

}
