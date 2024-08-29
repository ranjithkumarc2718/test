package practice;

public class Factorial {
	
	
	
	public static void  main (String args[])
	{
		long fact=1;
		int number =15;
		
		for (int i=1;i<=number;i++) {
			fact=fact*i;
//			System.out.println("Factorial value of "+i+" is "+fact);
		}
		System.out.println("Factorial of "+number+" is "+fact);
		//print random value
		System.out.println(Math.random());
	}

}
