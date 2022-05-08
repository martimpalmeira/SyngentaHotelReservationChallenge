import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;


class HotelReservationTest {

	@Test
	void testReturnRelevantInformation() {
		HotelReservation hotel = new HotelReservation();
		String[] expectedValues = { "Rewards", "thur", "fri", "sat" };
		assertArrayEquals(expectedValues,
				hotel.returnRelevantInformation("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)"));
	}

}