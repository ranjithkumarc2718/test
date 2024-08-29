package practice;

public class SumofElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= new int[] {10,20,30,40,50,60,70,80};
		
		//print the size of the array
		System.out.println("Size of array is : "+arr.length);
		
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			
			sum = sum+arr[i];
			
			
		}
		System.out.println("Sum of elements present in array is : "+sum);
	}

}
