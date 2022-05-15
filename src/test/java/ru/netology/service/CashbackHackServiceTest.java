package ru.netology.service;

import static org.testng.Assert.*;
import org.testng.Assert;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void cashback() {

        int amount = 2000;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void zeroCashback() {

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

}