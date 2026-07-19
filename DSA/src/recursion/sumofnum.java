package recursion;

public class sumofnum {
	static int num(int a) {
		if(a<=0)
			return 0;
		else
		return  a + num(a-1);
	}
	public static void main(String[] args) {
	System.out.println(num(4));

	}

}
