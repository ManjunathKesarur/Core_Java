package stringiconcept;
import java.util.Scanner;
public class nobuipalin {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println(" enter the string :");
		String s=s1.nextLine();
		char[] a=s.toCharArray();
		int i=0, j=s.length()-1;
		while(i<j) {
		if(a[i]!=a[j]) {
			System.out.println("invalid string");
			return;
		}
		i++;
		j--;
	}
		System.out.println("pakka palindrone");
	}
}
