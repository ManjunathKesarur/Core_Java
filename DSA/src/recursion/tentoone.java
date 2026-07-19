package recursion;

public class tentoone {
static void num(int a) {
	if(a>=1) {
		System.out.println(a);
		num(a-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		num(20);
	}

}
