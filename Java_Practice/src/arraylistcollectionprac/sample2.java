package arraylistcollectionprac;

import java.util.ArrayList;

public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1=new ArrayList();
		l1.add("mass");
		l1.add('a');
		l1.add(101);
		l1.add(true);
		l1.remove(0);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
	}

}
