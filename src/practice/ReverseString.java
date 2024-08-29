package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Dream Big";

		String reverseString = "";

		for (int i = string.length() - 1; i >= 0; i--) {

			reverseString = reverseString + string.charAt(i);
		}
		System.out.println("Original String : " + string);
		System.out.println("Reversed string : " + reverseString);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to be reversed :");
		String str = scanner.nextLine();

		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			revStr = revStr + str.charAt(i);
		}
		System.out.println("Original String from scanner : " + str);
		System.out.println("Reversed string : " + revStr);

	}

}
