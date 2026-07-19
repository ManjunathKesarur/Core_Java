package serious;

class father{
	 father(int a){
		System.out.println("manju"+a);
	}
	 father(String b) {
		this(90,"lol");
		System.out.println("shashi");
	}
	 father(int a, String b) {
		this(90);
		System.out.println("laxmi");
	}
	 father(String b,int a) {
		this("lol");
		System.out.println("parashuram");
	}
}
public class mm1 {

	public static void main(String[] args) {
	new father("shashwat",90);
	}

}
