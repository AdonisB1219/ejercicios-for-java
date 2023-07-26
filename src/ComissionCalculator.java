import java.util.Scanner;

public class ComissionCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type the amount of the sale: ");
		float sales = in.nextFloat();
		float comission = 0f;
		
		if (sales >= 10000) {
			comission = (sales * 0.3F);

		} else if (sales >= 5001) {
			comission = (sales * 0.2F);

		} else if (sales >= 1001) {
			comission = (sales * 0.1F);

		} else if (sales >= 0) {
			comission = 0f;

		} else {
			System.out.println("Invalid sales amount");
			sales = 0;
		}
		
		System.out.println("Your comision is: $" + comission);
		in.close();
	}//main

}//class
