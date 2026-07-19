package mock_prep1;

public class methoverload {
static void man() {
	System.out.println("hi");
}
void man(int a) {
	System.out.println("hello");
}
	public static void main(String[] args) {
		man();
		methoverload m1= new methoverload();
		m1.man();
			
	}

}
