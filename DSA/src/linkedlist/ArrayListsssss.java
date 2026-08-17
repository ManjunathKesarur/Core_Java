package linkedlist;

import java.util.ArrayList;

public class ArrayListsssss {

	public static void main(String[] args) {
		
		ArrayList<Object> aa=new ArrayList<Object>();
		
		aa.add("charlie");
		
		
		aa.add(1,"chchc");
		
		aa.add(2,7474);
		
		aa.add(3,2323);
		aa.add(23232);
		aa.add(23232);aa.add(23232);aa.add(23232);aa.add(23232);aa.add(23232);
		
		aa.add(10,444444);
		
		aa.add(1,444444);
		aa.add(3,"a");		
		for (Object aas : aa) {
			System.out.println("the value is :"+aas);
		}
		ArrayList<Object> dd=new ArrayList<Object>();
		
		dd.add("hu");
		
		ArrayList<Object> cc=new ArrayList<Object>();
		cc.add(1122);
		cc.addAll(1,dd);
		aa.addAll(2,dd);
		System.out.println(aa);
			
		System.out.println(cc.containsAll(dd));
	
	}
	
	
}
