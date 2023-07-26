import java.util.Scanner;

public class MovieDiscounts {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type your age: ");
		int age = in.nextInt();
		float ticketPrice = 7f;
		
		if (age >= 60) {
			ticketPrice *= 0.45f;

		} else if (age <= 5) {
			ticketPrice *= 0.4f;
		} 
		
		System.out.println("The ticket price is: $" + ticketPrice);
	}//main

}//class
