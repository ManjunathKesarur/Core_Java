package corestuff;

public class castings {

	int id;

	public castings(int id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		castings c3=(castings) obj;
			return this.id == c3.id;
	}
	
	public static void main(String[] args) {
		
	
		
	castings c1=new castings(112);
	castings c2=new castings(12);
	if(c1.equals(c2)) {
		System.out.println("sds");
	}else {
		System.out.println("sdsd");
	}
	
	}
}
