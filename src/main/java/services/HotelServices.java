package services;

import entities.Hotel;

public class HotelServices {

	public static double returnDayRatePayment(boolean isCustomerRegular, String nameOfTheDay, Hotel hotel) {
		if (isCustomerRegular) {
			if (nameOfTheDay.equals("mon") || nameOfTheDay.equals("tues") || nameOfTheDay.equals("wed")
					|| nameOfTheDay.equals("thur") || nameOfTheDay.equals("fri")) {
				return hotel.getRegularCustomerWeekDayTax();
			} else {
				return hotel.getRegularCustomerWeekendTax();
			}
		} else {
			if (nameOfTheDay.equals("mon") || nameOfTheDay.equals("tues") || nameOfTheDay.equals("wed")
					|| nameOfTheDay.equals("thur") || nameOfTheDay.equals("fri")) {
				return hotel.getPrivilegedCustomerWeekDayTax();
			} else {
				return hotel.getPrivilegedCustomerWeekendTax();
			}
		}
	}

	public static double[] returnArrayOfPayments(boolean isCustomerRegular, String[] RelevantInformations,
			Hotel hotel) {
		double[] paymentsForEachDay = new double[3];
		for (int i = 0; i < paymentsForEachDay.length; i++) {
			paymentsForEachDay[i] = returnDayRatePayment(isCustomerRegular, RelevantInformations[i + 1], hotel);
		}
		return paymentsForEachDay;
	}

	public static double returnHotelAccumulativeRate(double[] hotelRates) {
		double sumOfhotelRates = 0;
		for (int i = 0; i < hotelRates.length; i++) {
			sumOfhotelRates += hotelRates[i];
		}
		return sumOfhotelRates;
	}

	public static String getCheapestHotel(double totalHotel1, double totalHotel2, double totalHotel3, Hotel hotel1,
			Hotel hotel2, Hotel hotel3) {
		if (totalHotel1 < totalHotel2 && totalHotel1 < totalHotel3) {
			return hotel1.getName();
		} else if (totalHotel2 < totalHotel1 && totalHotel2 < totalHotel3) {
			return hotel2.getName();
		} else if (totalHotel3 < totalHotel1 && totalHotel3 < totalHotel2) {
			return hotel3.getName();
		} else if (totalHotel1 == totalHotel2 && totalHotel1 < totalHotel3) {
			return hotel2.getName();
		} else if (totalHotel1 == totalHotel3 && totalHotel1 < totalHotel2) {
			return hotel3.getName();
		} else if (totalHotel2 == totalHotel3 && totalHotel2 < totalHotel1) {
			return hotel3.getName();
		} else {
			return hotel3.getName();
		}
	}
}