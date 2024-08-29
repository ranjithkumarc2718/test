package practice;

public class SwitchStatement {

	public static void main(String []args) {
		
		
		int number=20;
		
		switch(number) {
		case 0:
		System.out.println("number is zero");	
		break;
		case 1:
			System.out.println("number is One");	
			break;
		case 2:
			System.out.println("number is two");	
			break;
		default:
			System.out.println("Number is not there in the list");
			System.out.println(number);
		}
		
		
	}
	
}
