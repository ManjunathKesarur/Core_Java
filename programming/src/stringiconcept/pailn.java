package stringiconcept;
import java.util.Scanner;
public class pailn {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the String Buddy");
			String x=s.nextLine();
			String res="";
			for(int i=x.length()-1;i>=0;i--) {
				res+=x.charAt(i);
			}
			if(x.equalsIgnoreCase(res)) {
				System.out.println("yes it is palindrom of : "+x+" and res is"+res);
			}else {
				System.out.println("no it is not a palindrom of : "+x+" \nand res is : "+res);
			}
	}

}
