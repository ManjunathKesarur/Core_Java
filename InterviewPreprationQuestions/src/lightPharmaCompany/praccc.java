package lightPharmaCompany;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class praccc {
public static void main(String[] args) {
	

	
	Integer ar[]= {10,30,40,50,20};
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter the which largest value to find :");
	int n=scanner.nextInt();

	Arrays.sort(ar ,Comparator.reverseOrder());
	
	
	
	
	
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
	
	for(int i=0;i<ar.length;i++) {
	
	if(n > ar.length) {
		System.out.println("not sufficient numbers");
			return;
	}else if(i == (n-1)) {
		System.out.println("\n"+ar[i]);
		
	}
	
	}
}
}
