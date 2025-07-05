import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CompanyTest {
    private Company company;
    private Passenger passenger;
    private Location pickup;
    private Location destination;

    @Before
    public void setUp() {
        company = new Company();
        passenger = new Passenger();
        pickup = new Location(10, 20);
        destination = new Location(30, 40);
    }

    @Test
    public void testScheduleVehicleSuccess() {
        company.addVehicle(new Vehicle(4)); // Assume method exists
        boolean result = company.scheduleVehicle(passenger, pickup, destination);
        assertTrue(result);
    }

    @Test
    public void testScheduleVehicleFailureIncreasesLostFares() {
        int lostBefore = company.getLostFares(); // Assume method exists
        boolean result = company.scheduleVehicle(passenger, pickup, destination);
        int lostAfter = company.getLostFares();
        assertFalse(result);
        assertEquals(lostBefore + 1, lostAfter);
    }
}

