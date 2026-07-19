package hashsetprac;

import java.util.HashSet;

public class sample3 {
public static void main(String[] args) {
	HashSet e=new HashSet();
	e.add("pooo");
	e.add(989);
	e.add('a');
	e.add("gg");
	for(Object a:e) {
		System.out.println(a);
	}
}	
}
