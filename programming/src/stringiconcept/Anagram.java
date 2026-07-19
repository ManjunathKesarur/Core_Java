package stringiconcept;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner; 

public class Anagram {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println(" enter the first words :\n");
		String s=s1.nextLine();
		System.out.println(" enter the second words :\n");
		String v=s1.nextLine();
		char[] a=s.toCharArray();
		char[] c=v.toCharArray();
		Arrays.sort(a);
		Arrays.sort(c);
		if(Arrays.equals(a,c)) {
			System.out.println("anagram");
		}else {
			System.out.println("not an anagram");
		}
	}

}
