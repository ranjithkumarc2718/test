package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class ForEachLoop {
	
	public static void main(String[] args) {
	//print array	
		int[] arr= {34,23,22,43,44,54};
		
		for(int i:arr) {
			System.out.println(i);
		}
	//print the list of values using array list	
	List<String> obj =new ArrayList<>();	
		obj.add("Ranjith");
		obj.add("Akalya");
		obj.add("Rithanya");
		obj.add("Aadheeran");
		obj.add("Savithri");
		
		for(String objects:obj) {
			System.out.println(objects);
		}	
	//print using Set
		
		 Set<Float> set = new HashSet<>();
		set.add(25.5f);
		set.add(50.45f);
		set.add(200.51f);
		
		for(float f: set) {
			System.out.println(f);
		}
		
	//print using map
		Map<String,Integer> map = new HashMap<>();
		
		map.put("RK", 33);
		map.put("AK", 28);
		map.put("VJ", 25);
		map.put("RP", 31);
		
		for(Map.Entry<String, Integer> maps : map.entrySet()) {
//			System.out.println(maps);
			System.out.println(maps.getKey() + " age is : " + maps.getValue());
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
