package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 900;
        int actual = hackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainUpBoundary() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1500;
        int actual = hackService.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testUpBoundary() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1429;
        int actual = hackService.remain(amount);
        int expected = 571;
        assertEquals(actual, expected);
    }

    // Тест с ошибкой
    @org.testng.annotations.Test
    public void testRemainNull() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;
        int actual = hackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}