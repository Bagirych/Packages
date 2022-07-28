package ru.netology.javaqamvn.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    SQRService sqrService = new SQRService();

    @Test
    public void calculateSQR() {
        int expected = 3;
        int actual = sqrService.calculateSQR(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMinLimit() {
        SQRService sqrService = new SQRService();

        int expected = 0;
        int min = 10;
        int max = 99;

        int actual = sqrService.calculateSQR(min, max);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MinLimit() {
        SQRService sqrService = new SQRService();

        int expected = 1;
        int min = 100;
        int max = 100;

        int actual = sqrService.calculateSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxLimit() {
        SQRService sqrService = new SQRService();

        int expected = 77;
        int min = 100;
        int max = 7396;

        int actual = sqrService.calculateSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMaxLimit() {
        SQRService sqrService = new SQRService();

        int expected = 77;
        int min = 500;
        int max = 308_000;

        int actual = sqrService.calculateSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
