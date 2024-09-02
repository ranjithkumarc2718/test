package practice;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Verify the character length. also,test the string: length!!!";

		int count = 0;

		for (int i = 0; i < string.length(); i++) {

			// to include spaces use the below line else use below if loop
//			count++;

			// to exclude space and count the number of characters
			if (string.charAt(i) != ' ') {
				count++;
			}

		}

		System.out.println("Number of characters present in String is: " + count);
		int count1 = 0;
		// to print the number of punctuation present in string
		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == ',' || string.charAt(i) == '!' || string.charAt(i) == ':'
					|| string.charAt(i) == '.') {

				count1++;
			}

		}
		System.out.println("Number of Punctutations present :" + count1);

	}

}
