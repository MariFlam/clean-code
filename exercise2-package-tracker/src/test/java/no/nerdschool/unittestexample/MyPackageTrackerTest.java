package no.nerdschool.unittestexample;

import no.nerdschool.parceltracker.MyParcelTracker;
import no.nerdschool.parceltracker.events.ParcelRegistered;
import org.junit.Test;
import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;

public class MyPackageTrackerTest {
    @Test
    public void verifyHandleNewStatus() {
        MyParcelTracker tracker = new MyParcelTracker();
        ParcelRegistered event = new ParcelRegistered("1234", LocalDateTime.now().toString(), "Hatt", "katt");
        assertEquals(0, tracker.getNumberOfParcelEvents("1234"));
        tracker.handleNewParcelStatus(event);
        assertEquals(1, tracker.getNumberOfParcelEvents("1234"));
        tracker.handleNewParcelStatus(event);
        assertEquals(2, tracker.getNumberOfParcelEvents("1234"));
    };
}
