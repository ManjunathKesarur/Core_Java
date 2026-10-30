package recursion;

public class sindoor {
public static void main(String[] args) {
	
//	int row=4;
//	
//	for(int i=0;i<row;i++) {
//		
//		for(int j=0;j<row-i;j++) {
//			System.out.print("*");
//		}
//		for(int j=0;j<=i ;j++) {
//			System.out.print("L ");
//		}
//		
//		System.out.println();
//	}
	
	int no=
			16;
	
	int i=0;
	int j=1;
	
	
	for(int k=0;k<=no;k++) {
		System.out.print(i+" ");
		
		int c=i+j;
		
	i=j;
	j=c;
	
	}
	
	
}
}
