package practice;

import java.util.Scanner;

public class CheckNumberPositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = scanner.nextInt();

		if (number > 0) {
			System.out.println("Number is positive");
		} else if (number < 0) {
			System.out.println("Number is negative");
		} else
			System.out.println("Number is zero");
	}

}
