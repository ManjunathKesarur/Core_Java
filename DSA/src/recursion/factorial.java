package recursion;

public class factorial {
static int num(int a) {
	if(a<=1)
		return 1;
	else
		return a * num(a-1);
}
	public static void main(String[] args) {
		
	int xx=	num(20);
System.out.println(xx);
	}

}
