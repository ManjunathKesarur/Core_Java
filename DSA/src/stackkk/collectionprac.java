package stackkk;

class collectionss {
	
	private	int x;
	
	
	public int	 get() {
		return x;
	}
	public	void set(int x) {
		this.x=x;
	}
}


class collectionprac{		
	
public static void main(String[] args) {
	collectionss collectionprac=new collectionss();
	
	
	collectionprac.set(32);
	
	System.out.println( collectionprac.get());
}
}
