package stackkk;

import java.util.Scanner;

public class augzerofive {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String a =scanner.next();
		char [] c=a.toCharArray();
		int i=0 ; int j=c.length-1;
		while (i<j) {
			char temp= c[i];
			c[i] = c[j];
			c[j] = temp;
		i++;
		j--;
		
		}
		System.out.println(c);
	}
}
