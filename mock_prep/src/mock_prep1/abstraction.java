package mock_prep1;
interface dino{
	void no();
}
class  rino implements dino{
	public void no() {
		System.out.println("ananana");
	}
}
class  pino implements dino{
	public void no() {
		System.out.println("a");
	}
}
class simm{
	static void jo(dino a) {
		a.no();
	}
}

public class abstraction {

	public static void main(String[] args) {
		simm.jo(new rino());
		simm.jo(new pino());

	}

}
