package stringiconcept;

import java.util.Arrays;

public class anaaug {
public static void main(String[] args) {
	String a="nigth";
	String b="nigth";
	
	char[] aa=a.toCharArray();
	char[]	bb=b.toCharArray();
	
	Arrays.sort(aa);
	Arrays.sort(bb);
	
	if(a.equals(b)) {
		System.out.println("anagrm");
	}else {
		System.out.println("not an anagram");
}
}
}
