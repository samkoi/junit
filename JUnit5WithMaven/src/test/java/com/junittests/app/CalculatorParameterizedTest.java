package com.junittests.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.ParameterizedTest;

// @RunWith(value=Parameterized.class)
public class CalculatorParameterizedTest {
    // private double expected;
    // private double valueOne;
    // private double valueTwo;

    // @Parameterized.Parameters
    // public static Collection<Integer[]> getTestParameters(){
    // return Arrays.asList(new Integer[][]{
    // {2,1,1}, {3,2,1}, {4,3,1},
    // });
    // }

    // public CalculatorParameterizedTest(double expected, double valueOne, double
    // valueTwo){
    // this.expected = expected;
    // this.valueOne = valueOne;
    // this.valueTwo = valueTwo;
    // }

    @ParameterizedTest
    @ValueSource([5,2,3],[40,10,30])
    public void sum(int[] values){
        Calculator calc = new Calculator();
        assertEquals(values[0], calc.add(values[1], values[2]),0);
    }
}
