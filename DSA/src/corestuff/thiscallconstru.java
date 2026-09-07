package corestuff;

public class thiscallconstru {

	public thiscallconstru(int a) {
		System.out.println("sa");
	}
	public thiscallconstru(String a) {
		this(1);
		System.out.println("hellow");
	}
	public thiscallconstru(String b,int as) {
		this("sds");
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
	new thiscallconstru("asa",121);
}
}
