package com.vocumsineratio.tdd.multiplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Danil Suits (danil@vast.com)
 */
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        Assertions.assertEquals(10, five.amount);
    }

    @Test
    public void testMultiplicationMicrostepTwo() {
        Dollar four = new Dollar(4);
        four.times(2);
        Assertions.assertEquals(8, four.amount);
    }
}
