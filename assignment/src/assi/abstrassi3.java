package assi;

interface zomato{
	public void code();
}
class kfc implements zomato{
	public void code() {
		System.out.println("finger linkin goood......");
	}
}
class mcd implements zomato{
	public void code() {
		System.out.println("happy meal mcd................ ");
	}
}
class vandus{
	static void momo(zomato a) {
		a.code();
	}
}


public class abstrassi3 {

	public static void main(String[] args) {
		
		kfc t=new kfc();
//		donkey d=
		vandus.momo(t);
		vandus.momo(new mcd());
	}

}
