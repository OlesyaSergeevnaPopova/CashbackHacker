package ru.netology.service;

import static org.testng.Assert.*;
import org.testng.Assert;


public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void cashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

}