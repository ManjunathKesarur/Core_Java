package mock_prep1;

class animal{
	void noise() {
		System.out.println("some noise");
	}
}
class dog extends animal{
	void noise() {
		System.out.println("bow bow");
	}}
class cat extends animal{
	void noise() {
		System.out.println("meow");
	}
}
class  simu {
	static void ani(animal a) {
		a.noise();
	}
}
public class polyy {

	public static void main(String[] args) {
		simu.ani(new dog());
		simu.ani(new cat());

	}

}
