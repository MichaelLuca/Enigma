/**
 *
 * @author tschue2s
 *
 */
package tschue2s;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

import java.time.*;

public class SchrankensteuerungTester {

	@Before
	public void setUp() {
		Auto a1 = new Auto();
	}
	
	@Test
	public void time_AutoEnterParkhaus_returnsTrue() {
		LocalDateTime now = LocalDateTime.now();
		assertEquals(now, a1.enterParkhaus());
	}
	
	@Test
	public void place_AutoPlatz_returnsTrue() {
		assertEquals(1, a1.place());
	}
	
	@Test
	public void price_ParkingPrice_returnsTrue() {
		assertEquals("1,89", a1.leaveParkhaus());
	}

}
