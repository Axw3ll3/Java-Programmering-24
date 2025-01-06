package se.iths;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

public class Account {

    Scanner sc = new Scanner(System.in);

    public void Account() {
        Account account = new Account(100);
    }

    public void DepositMoney (Account account) {
        System.out.println("How much do you want to deposit?");
        int depositedAmount = 100;
        int result = depositedAmount + account;
    }

    public void WithdrawMoney (Account account) {
        System.out.println("How much do you want to withdraw?");
        int withdrewAmount = 100;

    }

    public void Rent (Account account) {
        double rent = account + 1.04;
        System.out.println("Your rent is: " + rent);
    }
}