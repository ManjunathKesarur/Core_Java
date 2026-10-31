package lightPharmaCompany;

public class CircularArrayTraver {
public static void main(String[] args) {
	
	int [] arr= {12,333,442,121,1234};
	
	int start=4;
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[(start+i) % arr.length ]+" ");
	}
}
}
