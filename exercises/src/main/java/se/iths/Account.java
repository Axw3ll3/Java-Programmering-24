package se.iths;

import java.util.Scanner;

public class Account {
    private int saldo;
    private int amount;
    Scanner scanner = new Scanner(System.in);

    public Account() {
        this.saldo = 100;
        this.amount = 50;
    }

    public int WithdrawMoney(int amount) {
        return saldo - amount;
    }

    public int DepositMoney(int amount) {
        return saldo + amount;
    }
    public int getSaldo() {
        return saldo;
    }
    public double Rent() {
        double rent = saldo * 1.04;
        return rent;
    }

}
