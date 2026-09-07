package corestuff;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {

	public static void main(String[] args) {
		
//		Map<Integer,String> map=new HashMap<Integer, String>();
		
		
//Map<Integer,String> maps=new TreeMap<Integer, String>();
		
		Map<Integer,String> map=new LinkedHashMap<Integer, String>();
		
		
		map.put(1,"charlie");
		map.put(3, "jordan");
		map.put(5,"jeevane");
		map.put(4, "roxi");
		
		map.putIfAbsent(3,"ravan");
		
		map.remove(3);
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.containsKey(3));
		
		
	}
	
}
