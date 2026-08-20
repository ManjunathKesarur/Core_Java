package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsssss {

	public static void main(String[] args) {
		
		List<Integer> dmd=new ArrayList<Integer>();
		
		dmd.add(212);
		System.out.println(dmd);
		System.out.println(dmd.size());
		
		dmd.add(777);
		dmd.add(444);
		dmd.add(11);
		dmd.add(23);
		
		System.out.println(dmd.size());
		
		for(int i=0;i<dmd.size();i++) {
			Object oo=dmd.get(i);
			System.out.println(oo);
		}
		
		System.out.println("------------------");
		
		 int [] xy=new int [19];
		 
		 xy[0]=9999;
		 
		 
		 for(int aa : xy) {
		 System.out.println(aa);
		 }
		 
		 
		 
	}
	
	
}
