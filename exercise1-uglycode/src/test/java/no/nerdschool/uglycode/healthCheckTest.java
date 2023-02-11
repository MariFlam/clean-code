package no.nerdschool.uglycode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import no.nerdschool.uglycode.HealthCheck;
public class healthCheckTest {

    @Test
    public void healthCheckTest() {
        //Do stuff here
        //assertEquals("hat", HealthCheck.cmp("1 2 +"));
        //assertEquals(3, HealthCheck.cmp("1 2 +"));
        assertEquals(30-15, HealthCheck.cmp("15 30 -"));
    }
}
