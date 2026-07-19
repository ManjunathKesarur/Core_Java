package stringiconcept;

public class revsentence {
	public static void main(String[] args) {
	String s="hi buudy how are you";
	String res=" ";
	String[] aa=s.split(" ");
	for(int i=aa.length-1;i>=0;i--) {
		res+=aa[i]+" ";
	}
	System.out.println(res);
}}
