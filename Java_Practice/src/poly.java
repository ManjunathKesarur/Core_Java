class animal{
	void noise() {
		System.out.println("ha ha ha");
	}
}
class cow extends animal{
	void noise() {
		System.out.println("ambaaaaa ");
	}
}
class tiger extends animal{
	void noise() {
		System.out.println("hollllllllaaaaaa");
	}
}
class jai{
	static void chandan(animal a) {
		a.noise();
	}
}
public class poly {

	public static void main(String[] args) {
		jai.chandan(new cow());
		jai.chandan(new tiger());

	}

}
