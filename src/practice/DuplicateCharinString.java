package practice;

public class DuplicateCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Great responsibility";
		int count;
		char string1[] = string.toCharArray();

		System.out.println("Duplicate characters present in the string: ");

		for (int i = 0; i < string1.length; i++) {
			count = 1;
			for (int j = i + 1; j < string1.length; j++) {
				if (string1[i] == string1[j] && string1[i] != ' ') {

					count++;

					string1[j] = '0';
				}
			}
			if (count > 1 && string1[i] != '0') {
				System.out.println(string1[i]);

			}
		}

	}

}
