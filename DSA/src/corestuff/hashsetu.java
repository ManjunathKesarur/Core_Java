package corestuff;

import java.util.Comparator;
import java.util.TreeSet;


public class hashsetu {
public static void main(String[] args) {
	

//	HashSet<Integer> set=new HashSet<Integer>();
	
//	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	
	
	TreeSet<Integer> set=new TreeSet<Integer>(Comparator.reverseOrder());
	
	set.add(1);
	set.add(2);
	set.add(5);
	set.add(6);
	set.add(3);
	set.add(4);

	System.out.println(set.contains(2));
	
	set.remove(2);
	
	System.out.println(set);
	
	System.out.println(set.isEmpty());
	
	

}
}