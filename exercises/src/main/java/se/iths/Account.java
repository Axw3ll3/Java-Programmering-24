package se.iths;

import java.util.Scanner;

public class Account {
    private double saldo = 100.0;
    private double amount = 50.0;
    Scanner scanner = new Scanner(System.in);

    public Account() {
        this.saldo = saldo;
        this.amount = amount;
    }

    public double WithdrawMoney() {
        double result;
        result = saldo - amount;
        saldo = result;
        return saldo;
    }

    public double DepositMoney() {
        double result;
        result = saldo + amount;
        saldo = result;
        return saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public double Rent() {
        double rent;
        rent = saldo * 1.04;
        saldo = rent;
        return saldo;
    }

}
