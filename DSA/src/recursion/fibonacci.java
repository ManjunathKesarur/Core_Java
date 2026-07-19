package recursion;

import java.util.Scanner;

public class fibonacci {
	static int fib(int no) {
		if(no==0) {
			return 0;
		}
		else if(no==1 || no==2 ){
			return 1;
		}
		else {
			return fib(no-2) + fib(no-1);
		}
	}

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number to find fibonacci : ");
		int s=s1.nextInt();
System.out.println(fib(s));
	}

}
