package stringiconcept;

public class theone {
public static void main(String[] args) {
	String a="vavak";
	String rev="";
	char[] aa= 	a.toCharArray();
	
	int i=0; int j=a.length()-1;
	while(i<j) {
		if(aa[i]!=aa[j]) {
		System.out.println("not a palindrom");
	return ;
	}
			i++;
			j--;

	}
	System.out.println("palin");
	}
}
