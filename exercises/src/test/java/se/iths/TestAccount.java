package se.iths;

import org.mockito.Mock;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class TestAccount {
    @Test
    public void testCreateNewAccount() {

        Account account = new Account();

        assertEquals(100, account.getSaldo());
    }

    @Test
    public void testDeposit() {
        Account account = new Account();
        account.DepositMoney();
        assertEquals(150, account.getSaldo());
    }

    @Test
    public void testWithdraw() {
        Account account = new Account();
        account.WithdrawMoney();
        assertEquals(50, account.getSaldo());

    }

    @Test
    public void testRent() {
        Account account = new Account();
        account.Rent();
        assertEquals(104, account.getSaldo());
    }
}