package assi;
interface phone{
	public void code();
}
class apple implements phone{
	public void code() {
		System.out.println("ios code executed........");
	}
}
class oneplus implements phone{
	public void code() {
		System.out.println("oneplus code executed...........");
	}
}
class vandu{
	static void momo(phone a) {
		a.code();
	}
}

public class abstrassi2 {

	public static void main(String[] args) {
		apple t=new apple();
//		donkey d=
		vandu.momo(t);
		vandu.momo(new oneplus());

	}

}
