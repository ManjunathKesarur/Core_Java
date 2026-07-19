package exuhandelu;

public class UNWIND {
static void d1() {
	int v=3/0;
}
static void d2() {
	d1();
}
static void d3() {
	d2();
}
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~start~~~~~~~~~~~~~");
	try {
		d3();
	}
	catch (Exception e1) {
		e1.printStackTrace();
		System.out.println("handeled");
	}finally {
		System.out.println("hi bro i am fnally block");
	}
System.out.println("~~~~~~~~~~~~~~~end~~~~~~~~~~~~~~~~");
	}

}
