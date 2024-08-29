package practice;

import java.util.Scanner;

public class FindLargerstNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		int a,b,c,temp,largest;
		
		System.out.print("Enter the first number: ");
		
		a=scanner.nextInt();
		System.out.print("Enter the second number: ");
		b=scanner.nextInt();
		System.out.print("Enter the Third number: ");
		c=scanner.nextInt();
		
		temp=a>b?a:b;
		
		largest =c>temp?c:temp;
		System.out.println("Largest number: "+largest);
		
	}

}
