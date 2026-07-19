package mock_prep1;

public class passuref {
	int a=10;
	void display(passuref obj) {
		System.out.println("This is parent class"+obj.a);
	}
	public static void main(String[] args) {
				passuref man=new passuref();
				man.display(man);
				System.out.println(man.a);
	}

}
