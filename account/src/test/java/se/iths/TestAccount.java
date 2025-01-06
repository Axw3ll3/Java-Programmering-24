package se.iths;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {
    @Test
    public void testCreateNewAccount() {
        Account account = new Account(100);

        assertEquals(100, account.balance);
    }
}