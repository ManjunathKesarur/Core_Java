package vectorandarry;

import java.util.Collection;
import java.util.Vector;

public class sample1 {
static void area(Collection c) {
	for(int i=0;i<c.size();i++) {
		Vector l2=(Vector)c;
		int r=(int)l2.get(i);
		final double pi=3.1423;
		double res=pi*r*r;
		System.out.println(res);
	}
}
	public static void main(String[] args) {
		Vector l1=new Vector(4);
		l1.add(3);
		l1.add(9);
		l1.add(1);
		l1.add(5);
		area(l1);

	}

}
