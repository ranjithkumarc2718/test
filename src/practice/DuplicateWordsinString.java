package practice;

public class DuplicateWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string ="Big black bug bit a big black dog on his big black nose";
		int count;
		string =string.toLowerCase();
		
		String[] words= string.split(" ");   
		
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count=count+1;
//					System.out.println(words[i]);
					words[j]="0";
				}
				
				
			}
			
			if(count>1&& words[i]!="0") {
//				if(count>1) {
				System.out.println(words[i]);
			}
			
		}
		
		
		

	}

}
