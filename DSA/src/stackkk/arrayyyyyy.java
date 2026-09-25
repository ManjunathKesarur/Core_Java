package stackkk;

import java.util.Arrays;

public class arrayyyyyy {

	public static void main(String[] args) {
		
		int start =1;
		int end=6;
		
		for (int i=start;i<=end;i++) {
			System.out.println(i);
		}
		
		
		
		int [] an= {12,31,21,11,14};
	
		for (int a:an) {
			System.out.println(a);
		}
		
		String xo="ascd";
		char [] a=xo.toCharArray();
		Arrays.sort(a);
		
		System.out.println(xo.length());
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			
		}
		
		for(int i=0;i<xo.length();i++) {
			System.out.println(xo.charAt(i));
		}
		
		System.out.println(an.length);
		
		for (int i=0;i<an.length;i++) {
			System.out.println(an[i]);
		}
	}
		
}
