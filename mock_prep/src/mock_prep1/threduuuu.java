package mock_prep1;

//import sun.jvm.hotspot.runtime.Threads;

public class threduuuu {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			System.out.println(i);
		}

	}

}
