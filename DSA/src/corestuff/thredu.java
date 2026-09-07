package corestuff;



public class thredu {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
