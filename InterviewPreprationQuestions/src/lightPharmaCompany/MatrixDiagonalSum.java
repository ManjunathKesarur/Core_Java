package lightPharmaCompany;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3}
			   ,{4,5,6}
			   ,{7,8,9}
		};
	
		int n=arr.length;
		int sum=0;
		
		for(int i=0;i<n;i++) {
   		sum=sum+arr[i][i];     ///primary diagonal like :   -                    seconday :           -
//															 -										 -
//															  -                                     -
		if( i!=n-1-i) {
			sum=sum+arr[i][n-1-i];
		}
		}
		System.out.println("the diagonal summ is :"+sum);
		
		
	}
}
