package stackkk;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class pr4 {
	public static void main(String[] args) {
		
	String day="tuesda";
	
	switch (day) {
	
	case "monday" : System.out.println("hello");
	break;
	
	case "tuesday":System.out.println("tuesday");
	break;
	
	default :System.out.println("lowda");
	}
	
	pr4.pattern(5);
	
	
	
	List<String> name = new ArrayList<String>();
	name.add("s");
	name.add("sas");
	
	for (String a :name) {
		System.out.println(a);
	}
	
	
	String x="manju";
	try {
		System.out.println(x.charAt(4));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	int sr=5;
	for(int i=0;i<sr;i++) {
		
		for(int j=sr-1 ; j>i ;j--) {
			System.out.print("c");
		}
		
		System.out.println("hi");
	}
	
	
	}
	
	public static void pattern(int rows) {
		
		for(int i=0 ; i< rows ; i++) {
			for(int j=rows - 1 ; j>i  ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("$ ");	
			
			}
			System.out.println();		
		}
		for(int i=rows-3 ; i>=0 ; i--) {
			for(int j=rows - 1 ; j>i  ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");	
			
			}
			System.out.println();		
		}
	}
	
}
