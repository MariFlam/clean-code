package no.nerdschool.uglycode;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
public class HealthCheckTest {
    @Test
    public void checkIfNotString() {
        assertEquals(0, HealthCheck.cmp(1234));
    }
    //@Test
    //public void checkIfNotNumbers() {
       // assertEquals((Class String, HealthCheck.cmp("1 2 +".class)); //write one that checks type
    //}
    @Test
    public void checkIfAddition() {
        assertEquals(3, HealthCheck.cmp("1 2 +"));
    }
    @Test
    public void checkIfSubtraction() {
        assertEquals(-1, HealthCheck.cmp("1 2 -"));
    }
    @Test
    public void checkIfMultiplication() {
        assertEquals(2, HealthCheck.cmp("1 2 *"));
    }
    @Test
    public void checkIfDivision() {
        assertEquals(3, HealthCheck.cmp("6 2 /"));
    }
    @Test
    public void checkIfOtherDivides() {
        assertEquals(3, HealthCheck.cmp("6 2 7"));
    }
    @Test
    public void checkIf0returns0() {
        assertEquals(0, HealthCheck.cmp("6 0 /"));
    }
    @Test(expected = NumberFormatException.class)
    public void checkBadString() {
        HealthCheck.cmp("hatt katt fnatt");
    }
}