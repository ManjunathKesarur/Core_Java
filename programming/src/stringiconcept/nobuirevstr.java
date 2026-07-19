package stringiconcept;

public class nobuirevstr {

	public static void main(String[] args) {
		String s="rava";
		char[] aa=s.toCharArray();
		int i =0 ;  int j = s.length()-1;
		while(i<j) {
			char temp=aa[i];
			aa[i]=aa[j];
			aa[j]=temp;
			i++;
			j--;
			
		}
		System.out.print(aa);
}
	

}
