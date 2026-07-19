package arraylistcollectionprac;

import java.util.ArrayList;

public class sample6 {

	public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add("mass");
	l1.add('a');
	l1.add(101);
	l1.add(true);
					for(int i=0; i<l1.size();i++) {
						Object o1=l1.get(i);
						System.out.println(o1);
					}
	}

}
