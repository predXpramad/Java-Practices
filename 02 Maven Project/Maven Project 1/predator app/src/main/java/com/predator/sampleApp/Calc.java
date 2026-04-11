package com.predator.sampleApp;

public class Calc {
    int divide(int num1, int num2){
        int result = 0;
        try{
            result = (int) num1/num2;
            return result;
        } catch (ArithmeticException e) {
            num2 = 1;
        }
        return num1;

    }
}
