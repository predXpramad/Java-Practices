package com.predator.sampleApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    @Test
    void testCalc(){
        Calc calc = new Calc();
        int actualResult = calc.divide(10,2);
        int expectedResult = 5;

        assertEquals(expectedResult,actualResult);

    }
}
