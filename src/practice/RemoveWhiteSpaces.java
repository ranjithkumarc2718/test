package practice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string ="This   is a  string   where  whitespace need to  be removed";
		
		System.out.println(string);
		string = string.replaceAll("\\s+", "");
		
		System.out.println("String without spaces: "+string);
		
		

	}

}
