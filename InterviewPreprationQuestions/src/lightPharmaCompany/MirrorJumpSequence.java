package lightPharmaCompany;

public class MirrorJumpSequence {
public static void main(String[] args) {
	
	int [] array= {120,210,10,20,220,400};

	int mid= array.length/2;
	
	System.out.print(array[mid]+" ");
	
	for(int i=1;i<=mid;i++) {
		
		if(mid-i>=0)
		System.out.print(array[mid-i]+" ");
		
		if(mid+i<array.length)
		System.out.print(array[mid+i]+" ");
	}
	

	
}
}
