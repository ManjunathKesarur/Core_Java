package stringiconcept;
public class revwordsinsen {
	public static void main(String[] args) {
		String s="hi bro how are you now ";
		String [] a=s.split(" ");
		for(int i=0;i<=a.length-1;i++) {
		System.out.print(mm(a[i]+" "));
		}
	}
	static String mm(String x) {
		String res=" ";
		for(int i=x.length()-1;i>=0;i--) {
			res+=x.charAt(i);
		}
		return res;
	}
}
