package recursion;

public class revstr {
	
	static String rev(String str) {
		if(str.isEmpty())
			return str;
		else
			return rev(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(rev("manjunath kesa" ));
	}

}
