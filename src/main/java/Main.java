import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		HotelReservation hotel = new HotelReservation();
		print(hotel.getCheapestHotel(readInput()));
	}
	
	public static String readInput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
}
