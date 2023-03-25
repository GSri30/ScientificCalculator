package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AppTest {
    App calculator;
    private double DELTA = 1e-9;

    @Before
    public void init(){
        calculator = new App();
    }

    @Test
    public void sqrtTrue(){
        assertEquals("#1 Square Root : True", 9, calculator._sqrt(81), DELTA);
    }

    @Test
    public void sqrtFalse(){
        assertNotEquals("#1 Square Root : False", 5, calculator._sqrt(100), DELTA);
    }

    @Test
    public void factorialTrue(){
        assertEquals("#1 Factorial : True", 6, calculator._factorial(3), DELTA);
    }

    @Test
    public void factorialFalse(){
        assertNotEquals("#1 Factorial : False", 24, calculator._factorial(3), DELTA);
    }

    @Test
    public void logTrue(){
        assertEquals("#1 Log : True", 0, calculator._log(1), DELTA);
    }

    @Test
    public void logFalse(){
        assertNotEquals("#1 Log : False", 1, calculator._log(1), DELTA);
    }

    @Test
    public void powerTrue(){
        assertEquals("#1 Power : True", 9, calculator._pow(3, 2), DELTA);
    }

    @Test
    public void powerFalse(){
        assertNotEquals("#1 Power : False", 8, calculator._pow(3, 2), DELTA);
    }
}
