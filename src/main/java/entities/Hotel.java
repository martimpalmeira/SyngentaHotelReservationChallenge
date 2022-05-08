package entities;

public class Hotel {

	private String name;
	private int hotelRating;
	private double regularCustomerWeekDayTax;
	private double privilegedCustomerWeekDayTax;
	private double regularCustomerWeekendTax;
	private double privilegedCustomerWeekendTax;

	public Hotel(String name, int hotelRating, double regularCustomerWeekDayTax, double privilegedCustomerWeekDayTax,
			double regularCustomerWeekendTax, double privilegedCustomerWeekendTax) {
		this.name = name;
		this.hotelRating = hotelRating;
		this.regularCustomerWeekDayTax = regularCustomerWeekDayTax;
		this.privilegedCustomerWeekDayTax = privilegedCustomerWeekDayTax;
		this.regularCustomerWeekendTax = regularCustomerWeekendTax;
		this.privilegedCustomerWeekendTax = privilegedCustomerWeekendTax;
	}

	public int getHotelRating() {
		return hotelRating;
	}

	public String getName() {
		return name;
	}

	public double getRegularCustomerWeekDayTax() {
		return regularCustomerWeekDayTax;
	}

	public double getPrivilegedCustomerWeekDayTax() {
		return privilegedCustomerWeekDayTax;
	}

	public double getRegularCustomerWeekendTax() {
		return regularCustomerWeekendTax;
	}

	public double getPrivilegedCustomerWeekendTax() {
		return privilegedCustomerWeekendTax;
	}


}