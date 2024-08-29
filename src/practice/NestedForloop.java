package practice;

public class NestedForloop {

	public static void main(String[] args) {

		int count = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print("+ for i +,");
			for (int j = 1; j <= count; j++) {
				System.out.print(" for loop j + ");
			}
		}

		// print * in pyramid in ascending order
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		// print pyramid in descending order
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		// print multiplication table
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= 15; j++) {
				System.out.println(i + "*" + j + " = " + i * j + "\t");
			}
		}
		System.out.println();

		// print 2d array
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
