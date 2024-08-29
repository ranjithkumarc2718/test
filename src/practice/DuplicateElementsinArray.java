package practice;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,2,3,1,4,7,8,8,9,9};
		
		System.out.print("Duplicate ellements are : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]);
				}
			}
		}

	}

}
