package hashsetprac;

import java.util.HashSet;

public class sample1 {

	public static void main(String[] args) {
		HashSet l1=new HashSet();
		l1.add(10);
		l1.add(20.6);
		l1.add(true);
		l1.add(10);
		l1.add('A');
			
		l1.remove(10);
		l1.add(7,"baba");
		
		
		for(Object ol:l1) {
			System.out.println(ol);
		}
	}

}
