package assi;
interface bank{
	public void code();
}
class paytm implements bank{
	public void code() {
		System.out.println("patm par 10rs prapt hue");
	}
}
class sbi implements bank{
	public void code() {
		System.out.println("sbi par 20 aya");
	}
}
class vanadu{
	static void momo(bank a) {
		a.code();
	}
}


public class abstrassi5 {

	public static void main(String[] args) {

		paytm t=new paytm();
//		donkey d=
		vanadu.momo(t);
		vanadu.momo(new sbi());

	}

}
