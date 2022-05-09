import entities.Customer;
import entities.Hotel;
import services.HotelServices;

public class HotelReservation {

	public String getCheapestHotel(String input) {

		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 80, 90, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 160, 110, 60, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 100, 150, 40);

		String[] clientStatusAndWeekDaysNames = returnRelevantInformation(input);

		Customer customer = new Customer();
		customer.setCustomerStatus(clientStatusAndWeekDaysNames[0]);

		double totalHotel1 = HotelServices.returnHotelAccumulativeRate(
				HotelServices.returnArrayOfPayments(customer.isRegular(), clientStatusAndWeekDaysNames, hotel1));

		double totalHotel2 = HotelServices.returnHotelAccumulativeRate(
				HotelServices.returnArrayOfPayments(customer.isRegular(), clientStatusAndWeekDaysNames, hotel2));

		double totalHotel3 = HotelServices.returnHotelAccumulativeRate(
				HotelServices.returnArrayOfPayments(customer.isRegular(), clientStatusAndWeekDaysNames, hotel3));

		return (HotelServices.getCheapestHotel(totalHotel1, totalHotel2, totalHotel3, hotel1, hotel2, hotel3));
	}


	//Receives the input text and returns an array with customer status and days of the week
	public String[] returnRelevantInformation(String txt) {
		String txtNoSpace = txt.replace(" ", "");
		String txtNoComma = txtNoSpace.replace(",", "");
		String[] txtSeparado = txtNoComma.split("\\W");
		String[] relevantInformation = { txtSeparado[0], txtSeparado[2], txtSeparado[4], txtSeparado[6] };
		return relevantInformation;
	}

}
