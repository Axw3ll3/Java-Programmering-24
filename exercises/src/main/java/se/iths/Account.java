package se.iths;

public class Account {
    private int saldo;

    public Account(int saldo) {
        saldo = 100;
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
