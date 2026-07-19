import java.util.Scanner;
public class pp {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the sentence : \n\n");
		String s=s1.nextLine();
		String [] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(rev(arr[i]));
		}
		

	}
	public static String rev(String x){
		String res=" ";
		for(int i=x.length()-1;i>=0;i--) {
			res+=x.charAt(i);
		}
		return res;
	}

}

