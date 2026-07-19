package serious;
class mom{
	private int age;
	
	public void seAge(int age) {
			this.age=age;
	}
	public int getAge() {
		return age;
	}
}
public class encapu {

	public static void main(String[] args) {
		
			mom m=new mom();
			m.seAge(90);
			System.out.println(m.getAge());
			
	}

}
