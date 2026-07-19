package mock_prep1;
class ageex extends Exception{
	 ageex(String x) {
		 super(x);
		// TODO Auto-generated constructor stub
	}
}
public class ownex {

	public static void main(String[] args) {
		int age=19;
		try {
			if(age<18) {
				throw new ageex("go");
			}
			System.out.println("pop");
		}
		catch (ageex e) {
		System.out.println();
			System.out.println(e.getMessage());
		}
		
	}

}
