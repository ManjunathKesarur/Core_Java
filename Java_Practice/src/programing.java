import java.util.Arrays;
import java.util.Scanner;
public class programing {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter the 1st Anagram : ");
		String s=ss.next();
		s=s.toLowerCase();
		
		System.out.println("enter the 2nd Anagram : ");
		String s1=ss.next();
		s1=s1.toLowerCase();
		if(s.length()==s1.length()) {
			char [] c=s.toCharArray();
			char []c1=s1.toCharArray();
			Arrays.sort(c);
			Arrays.sort(c1);
			if(Arrays.equals(c,c1)) {
				System.out.println("the word is an anagram");
			}else {
				System.out.println("not anagram : ");
			}
		}
		else {
			System.out.println("the size is invalid");
		}
			
	}

}
