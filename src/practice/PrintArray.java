package practice;
public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {10,13,21,25,50,75};
		System.out.println("Print the array");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Print array in descending order : ");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
