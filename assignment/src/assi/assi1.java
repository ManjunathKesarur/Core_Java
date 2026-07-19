package assi;

interface animalu{
	public void noise();
}
class tigeru implements animalu{
	public void noise() {
		System.out.println("Hoaaaaaaaaa");
	}
}
class donkey implements animalu{
	public void noise() {
		System.out.println("ha huuuuuu");
	}
}
class expi{
	static void momo(animalu a) {
		a.noise();
	}
}

public class assi1 {

	public static void main(String[] args) {
		tigeru t=new tigeru();
//		donkey d=
		expi.momo(t);
		expi.momo(new donkey());

	}

}
