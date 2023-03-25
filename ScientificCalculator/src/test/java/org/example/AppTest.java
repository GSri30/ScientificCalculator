package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AppTest {
    App calculator;
    private double DELTA = 1e-15;

    @Before
    public void init(){
        calculator = new App();
    }

    @Test
    public void sqrtTrue(){
        assertEquals("#1 Square Root : True", 9, calculator._sqrt(81), DELTA);
        assertEquals("#2 Square Root : True", 0, calculator._sqrt(0), DELTA);
        assertEquals("#3 Square Root : True", 10.488088481701515, calculator._sqrt(110), DELTA);
        assertEquals("#4 Square Root : True", -1, calculator._sqrt(-81), DELTA);    
    }

    @Test
    public void sqrtFalse(){
        assertNotEquals("#1 Square Root : False", 5, calculator._sqrt(100), DELTA);
        assertNotEquals("#2 Square Root : False", 10, calculator._sqrt(110), DELTA);
        assertNotEquals("#3 Square Root : False", 10, calculator._sqrt(-100), DELTA);
    }

    @Test
    public void factorialTrue(){
        assertEquals("#1 Factorial : True", 6, calculator._factorial(3), DELTA);
        assertEquals("#2 Factorial : True", 2.6525285981219103E32, calculator._factorial(30), DELTA);
        assertEquals("#3 Factorial : True", Double.POSITIVE_INFINITY, calculator._factorial(10000), DELTA);
    }

    @Test
    public void factorialFalse(){
        assertNotEquals("#1 Factorial : False", 24, calculator._factorial(3), DELTA);
        assertNotEquals("#2 Factorial : False", 6, calculator._factorial(-3), DELTA);
        assertNotEquals("#3 Factorial : False", 0, calculator._factorial(1000), DELTA);
    }

    @Test
    public void logTrue(){
        assertEquals("#1 Log : True", 0, calculator._log(1), DELTA);
        assertEquals("#2 Log : True", 2.302585092994046, calculator._log(10), DELTA);
        assertEquals("#3 Log : True", -1, calculator._log(0), DELTA);
    }

    @Test
    public void logFalse(){
        assertNotEquals("#1 Log : False", 1, calculator._log(1), DELTA);
        assertNotEquals("#2 Log : False", 1, calculator._log(0), DELTA);
        assertNotEquals("#3 Log : False", 0, calculator._log(-1), DELTA);
    }

    @Test
    public void powerTrue(){
        assertEquals("#1 Power : True", 9, calculator._pow(3, 2), DELTA);
        assertEquals("#2 Power : True", 14.515932837559118, calculator._pow(3.2, 2.3), DELTA);
        assertEquals("#3 Power : True", Double.POSITIVE_INFINITY, calculator._pow(1000, 1000), DELTA);
    }

    @Test
    public void powerFalse(){
        assertNotEquals("#1 Power : False", 8, calculator._pow(3, 2), DELTA);
        assertNotEquals("#2 Power : False", 14.51, calculator._pow(3.2, 2.3), DELTA);
        assertNotEquals("#3 Power : False", Double.POSITIVE_INFINITY, calculator._pow(1000, -1000), DELTA);
    }
}
