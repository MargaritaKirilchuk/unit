package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateIfAmount1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIf0(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfLessThan1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @org.junit.jupiter.api.Test
    public void CalculateIfAmount1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void CalculateIf0(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual,expected);
    }

    @org.junit.jupiter.api.Test
    public void CalculateIfLessThan1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }
    }
