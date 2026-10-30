package recursion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class thisorsuper {
	
	public thisorsuper() {
		System.out.println("as");
	}
	public thisorsuper(int a) {
		this();
		System.out.println(a);
	}
	
public static void main(String[] args) {
	thisorsuper as=new thisorsuper(1);
	
	List<Integer> aaaa=new ArrayList<Integer>();
	
	aaaa.add(1); aaaa.add(2); aaaa.add(3);
	List<Integer> aaa=new ArrayList<Integer>();
	
	aaa.add(2); aaa.add(3); aaa.add(4);
	System.out.println(aaaa);
	System.out.println(aaa);
	aaaa.retainAll(aaa);
	System.out.println(aaaa);
	System.out.println(aaa);
}}

class ka implements Serializable {

	
}

