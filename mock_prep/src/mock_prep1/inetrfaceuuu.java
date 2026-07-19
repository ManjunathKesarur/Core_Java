package mock_prep1;

abstract interface sa{
	public abstract void test();
	public abstract void disp();
}
abstract class kar implements sa{
	public void test() {
		System.out.println("hi");
	}
//	public void disp() {
//		System.out.println("hwdwdwdwi");
//	}
}

public class inetrfaceuuu {

	public static void main(String[] args) {
		kar s=new kar();
		s.test();
		s.disp();
		

	}

}
