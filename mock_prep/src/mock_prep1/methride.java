package mock_prep1;

class wap_v1{
	void chat() {
		System.out.println("hi");
	}
}
class wap_2 extends wap_v1{
	void chat() {
		System.out.println("bow");
//		super.chat();
	}
}
class wap_3 extends wap_v1{
	void chat() {
		System.out.println("meow");
//		super.chat();
	}
}
public class methride {

	public static void main(String[] args) {
	wap_v1 cok=new wap_2();
	cok.chat();
	wap_v1 lok=new wap_3();
	lok.chat();
	}

}
