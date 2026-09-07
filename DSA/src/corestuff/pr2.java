package corestuff;

class oracle{
	void simple() {
		System.out.println("dsdsd");
	}
	void sam() {
		System.out.println("aaa");
	}
}
class pr2 extends oracle {
	
	void simple() {
		System.out.println("dasa");
	}
	
public static void main(String[] args) {
	
	oracle a=new pr2();
	
	a.simple();
	a.sam();
}
}
