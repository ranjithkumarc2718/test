package practice;
public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ch1='a';
		int ch2='b';
		
		System.out.println("Ascii value is "+ch1);
		System.out.println("Ascii value is "+ch2);
		
		//another way of delcaring value using casting
		
		char ch3 ='c';
		char ch4='d';
		
		int asciival1 =(int)ch3;
		int asciival2 =(int)ch4;
		
		System.out.println("Ascii value is "+asciival1);
		System.out.println("Ascii value is "+asciival2);
//		The following program prints the ASCII value (0 to 255) of all the characters. In the output, we have shown a few values.
		for(int i = 0; i <= 255; i++)  
		{  
		System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
		}  
		
//		If we want to print the ASCII value of all the alphabets (A to Z), we can set the values in the loop and print them.
		for(int i = 65; i <= 90; i++)  
		{  
		System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
		}  
		
	}

}
