package mock_prep1;


public class unwind {
	static void disp3(){
		int x=10/0;
		System.out.println("error");
	}
	static void disp2() {
		disp3();
	}
	static void disp1() {
		disp2();
	}
	public static void main(String[] args) {
		System.out.println("satrts`````");
	try {
		disp1();
	}catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("ends``````````````");
	}

}
