package practice;

public class VowelsandConsonentsinSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string ="This is a really simple sentence";
		
		int vowCount=0,consCount=0;
		
		string =string.toLowerCase();
		
		for(int i=0;i<string.length();i++) {
			
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u') {
				vowCount++;
			}else if (string.charAt(i)>='a'&&string.charAt(i)<='z'){
				consCount++;
			}
			
		}
		System.out.println("Vowels count is : "+vowCount);
		System.out.println("Consonents count is : "+consCount);
	}

}
