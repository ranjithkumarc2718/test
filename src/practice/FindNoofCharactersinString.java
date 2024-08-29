package practice;

public class FindNoofCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string ="The best of both worlds!!!";
		
		int count =0;
		for(int i=0;i<string.length();i++) {
		
		if(string.charAt(i)!=' ') {
			count =count+1;
		}
		}
		System.out.println("No of characters present in string "+count);
	}

}
