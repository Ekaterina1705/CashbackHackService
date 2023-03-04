package ru.netology.sevice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void TestCashbackHackService() {
        assertEquals(service.remain(2800), 200);

    }

    @Test
    public void TestAmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void TestAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

}