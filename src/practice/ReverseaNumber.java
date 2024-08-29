package practice;

public class ReverseaNumber {

	public static void main(String[] args) {
		
		int number =23435,reverse =0,remainder;
		
		while(number!=0) {
			
	 remainder = number%10;
	 reverse =reverse*10+remainder;
	 number =number/10;	
			
		}System.out.println("Reverse number is "+reverse);
		
	}
	
	
	
}
