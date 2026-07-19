package threduu;

public class t1 extends Thread {

	public static void main(String[] args) {
			for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
				System.out.print("manjunath"+" ");
			}

	}

}
