package stringiconcept;

//public class aski {
//
//	public static void main(String[] args) {
//		char x=66;
//		System.out.println(x+"ulli");
//		
//
//	}
//
//}



//~~~~~~ example for private ~~~~~~~~~~~~~


 class popp{
	private static void sis() {
		
		System.out.println("hi");
		
	}
	public static void mom() {
		sis();
	}
	  boolean sio() {
		boolean mol=true;
//		System.out.println("hi");
		return mol;
	}
}
public class aski{
	public static void main(String [] args) {
		popp.mom();
//		popp.sis();
		boolean m=  new popp().sio();
		System.out.println(m);
	}
}