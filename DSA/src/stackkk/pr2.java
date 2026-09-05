package stackkk;

import java.util.Scanner;

public class pr2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String a=scanner.next();
		String rev="";
		
		int i;
		for (i=a.length()-1;  i>=0 ; i--) {
			
			rev+=a.charAt(i);
		}
		if(!a.equalsIgnoreCase(rev)) {
			System.out.println("not an anagram");
		}else
		System.out.println("anagram");
	}
}
