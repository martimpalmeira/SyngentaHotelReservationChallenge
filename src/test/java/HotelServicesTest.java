import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Hotel;
import services.HotelServices;

class HotelServicesTest {

	@Test
	void testReturnDayRatePayment() {
		assertEquals(110, HotelServices.returnDayRatePayment(true, "mon", new Hotel("Lakewood", 3, 110, 80, 90, 80)));
		assertEquals(80, HotelServices.returnDayRatePayment(false, "tues", new Hotel("Lakewood", 3, 110, 80, 90, 80)));
		assertEquals(90, HotelServices.returnDayRatePayment(true, "sat", new Hotel("Lakewood", 3, 110, 80, 90, 80)));
		assertEquals(80, HotelServices.returnDayRatePayment(false, "sun", new Hotel("Lakewood", 3, 110, 80, 90, 80)));
	}

	@Test
	void testReturnArrayOfPayments() {
		double[] expectedValues = { 110, 110, 110 };
		assertArrayEquals(expectedValues, HotelServices.returnArrayOfPayments(true,
				new String[] { "Regular", "mon", "tues", "wed" }, new Hotel("Lakewood", 3, 110, 80, 90, 80)));
	}

	@Test
	void testReturnHotelAccumulativeRate() {
		assertEquals(330, HotelServices.returnHotelAccumulativeRate(new double[] { 110, 110, 110 }));
	}

	@Test
	void testGetCheapestHotel() {
		assertEquals("Lakewood",
				HotelServices.getCheapestHotel(330, 480, 660, new Hotel("Lakewood", 3, 110, 80, 90, 80),
						new Hotel("Bridgewood", 4, 160, 110, 60, 50), new Hotel("Ridgewood", 5, 220, 100, 150, 40)));
	}

}
