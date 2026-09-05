package stackkk;


class oc{
 	void or() {
	System.out.println("sa");
}
}

public class pr extends oc {

	static  int x;
	
	public  int  sum(int a) {
	int c=a+a;
	return c;	
	}
	
	
	public static void main(String[] args) {
	
		
	System.out.println(	new pr().sum(12));
	
	new oc().or();
	
}
}
