package assi;
interface server{
	public void code();
}
class google implements server{
	public void code() {
		System.out.println("google code executed........");
	}
}
class ms implements server{
	public void code() {
		System.out.println("ms code executed......");
	}
}
class vanduu{
	static void momo(server a) {
		a.code();
	}
}

public class abstrassi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		google t=new google();
//		donkey d=
		vanduu.momo(t);
		vanduu.momo(new ms());

	}

}
