package mock_prep1;

abstract class sam{
	abstract void sidp();
}
class sma1 extends sam{
	void sidp() {
		System.out.println("hi");
	}
	void test() {
		System.out.println("popppp");
	}
	
}
class lol extends sma1{
	void test() {
		System.out.println("poppphghgjhjhjhjp");
	}
}
public class abstracttt {

	public static void main(String[] args) {
	
 lol a=new lol();
	a.test();
	a.sidp();
	}

}
