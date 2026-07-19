package mock_prep1;

public class thiscalling {

	public thiscalling(int a) {
	System.out.println("ok");
	}
	public thiscalling(String b) {
		this(19);
		System.out.println("hello");
	}
	public thiscalling(String b,int a) {
		this("manju");
		System.out.println("zoya");
	}
	public thiscalling(int a,String b) {
		this("man",19);
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		thiscalling dd=new thiscalling(10,"manju");

	}

}
