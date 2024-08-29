package practice;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr =new int[] {32,1,54,53453,24,644,454,5,65,58,889};
		
		Arrays.sort(arr);
		
		System.out.println("Sorted array is : ");
		for(int arr2 : arr) {
			System.out.print(arr2+" ");
		}
		
		
		
	}

}
