package practice;

import java.util.Arrays;

public class ForLoop {

	public static void main(String[] args) {
		
		int sum =0;
		for(int i=100;i<=200;i++) {
			sum=sum+i;		}
		System.out.println("Sum is "+sum);
		
		//print array in descending order
		int arr[]= {1,20,30,684,85,60,87,88,79,10};
		
		for (int i=arr.length-1;i>=0;i--) {
			System.out.println("Array value is "+arr[i]);
		}
		Arrays.toString(arr);
		Arrays.sort(arr);
		//array sort
		System.out.println("After sort "+Arrays.toString(arr));
		//print array in ascending order
		int[] arr1= {1,3,4,5,6,8,9};
		
		for(int i=0;i<arr1.length;i++) {
			
		System.out.println("Print array in ascending order "+arr1[i]);	
		
		
		
		}
	}
	
	
}
