package no.nerdschool.uglycode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class HealthCheckTest {
    @Test
    public void checkIfNotString() {
        assertEquals(0, HealthCheck.compute(1234));

    }
    //@Test
    //public void checkIfNotNumbers() {
       // assertEquals((Class String, HealthCheck.compute("1 2 +".class)); //write one that checks type
    //}
    @Test
    public void checkIfAddition() {
        assertEquals(3, HealthCheck.compute("1 2 +"));
    }
    @Test
    public void checkIfSubtraction() {
        assertEquals(-1, HealthCheck.compute("1 2 -"));
    }
    @Test
    public void checkIfMultiplication() {
        assertEquals(2, HealthCheck.compute("1 2 *"));
    }
    @Test
    public void checkIfDivision() {
        assertEquals(3, HealthCheck.compute("6 2 /"));
    }
    @Test
    public void checkIfOtherDivides() {
        assertEquals(3, HealthCheck.compute("6 2 7"));
    }
    @Test
    public void checkIf0returns0() {
        assertEquals(0, HealthCheck.compute("6 0 /"));
    }
}