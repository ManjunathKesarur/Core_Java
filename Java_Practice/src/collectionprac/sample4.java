package collectionprac;

public class sample4 {
static int sum=0;
static byte[] arr= {10,20,30,40,50};	
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		}System.out.println(sum);
	}
}
