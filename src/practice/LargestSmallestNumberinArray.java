package practice;

public class LargestSmallestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= new int[]{10,200,3,223,32,43};
		
		//to print smallest number in array
		int min =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println("Minimum vaule in array "+min);
		
		
		//to print largest number in array
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Maximum vaule in array "+max);
	}

}
