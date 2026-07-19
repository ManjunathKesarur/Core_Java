package stringiconcept;

public class revstring {

	public static void main(String[] args) {
			String s="manjunath";
			String mm=" ";
			for(int i=s.length()-1;i>=0;i--) {
				mm+=s.charAt(i);
			}
				System.out.println("the reversed word is : "+mm);
	}

}
