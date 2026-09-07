package corestuff;

import java.util.ArrayList;

public class colleclist {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		
		arrayList.add("asasa");
		arrayList.add("sip");
		
		System.out.println(arrayList);
		
		arrayList.add(1,"ds");
		arrayList.add("ds");
		
		System.out.println(arrayList);
		
		
		arrayList.remove("ds");
		System.out.println(arrayList);
		
	System.out.println(	arrayList.size());
		
		
	}
}
