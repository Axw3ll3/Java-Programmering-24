package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestAccount {
    @Test
    public void testCreateNewAccount() {
        Account account = new Account(100);
        assertEquals(100, account.balance);
    }
}