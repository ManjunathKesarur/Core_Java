package mock_prep1;

public class equalsover {
	int eid;
	String ename;
	equalsover(int eid , String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	public boolean equals(Object obj) {
		equalsover s1=(equalsover)obj;
		return this.ename.equals(s1.ename);
	}

	public static void main(String[] args) {
		equalsover e1=new equalsover(100,"manju");
		equalsover e2=new equalsover(10,"manjup");
		System.out.println(e1.equals(e2));
		

	}

}
