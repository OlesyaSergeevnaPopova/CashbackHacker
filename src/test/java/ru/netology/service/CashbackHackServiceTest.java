package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void cashback() {

        int amount = 2300;
        int expected = 700;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @org.junit.Test
    public void ZeroCashback() {

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

}