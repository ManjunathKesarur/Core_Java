package corestuff;


class tri extends Thread{
	public void run() {
		System.out.println("sa");
	}
}


public class thredustart {
public static void main(String[] args) {
	tri tri=new tri();
	tri.start();
}
}
