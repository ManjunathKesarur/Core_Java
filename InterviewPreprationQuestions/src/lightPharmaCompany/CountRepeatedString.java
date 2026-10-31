package lightPharmaCompany;

import java.util.Scanner;

public class CountRepeatedString {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);

System.out.println("enter thr name : ");
String name=scanner.next();
int count=1;

for(int i=0;i<name.length()-1;i++) {
	if(name.charAt(i) == name.charAt(i+1)) {
		count++;
	}else {
		System.out.println(name.charAt(i)+""+count);
		count=1;
	}
}
	System.out.println(name.charAt(name.length()-1)+""+count);
}
}
