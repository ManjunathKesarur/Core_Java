package stackkk;

class mypi{
	double pi=212.21;
}

public class coreee {
	
static	void test(mypi data) {
		
data.pi=23232232;

data =new mypi();

System.out.println(data.pi=987.32);
	
	}
	public static void main(String[] args) {
	
		mypi mypi=new mypi();
		
		System.out.println("befor:\n"+mypi.pi);
		
		test(mypi);
		
		System.out.println(mypi.pi);
	}
	
}
