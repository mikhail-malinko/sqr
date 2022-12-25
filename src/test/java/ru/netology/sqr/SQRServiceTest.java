package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void maximumValueRange() {
        SQRService service = new SQRService();

        int actual = service.numberOfSquares(100, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theRangeOfValuesIsGreaterThanTheMaximum() {
        SQRService service = new SQRService();

        int actual = service.numberOfSquares(99, 9802);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void valueRangeLessThanMaximum() {
        SQRService service = new SQRService();

        int actual = service.numberOfSquares(101, 9800);
        int expected = 88;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minimumIsGreaterThanMaximum() {
        SQRService service = new SQRService();

        int actual = service.numberOfSquares(300, 200);
        int expected = 0;
        // система не работает;

        Assertions.assertEquals(expected, actual);
    }


}
