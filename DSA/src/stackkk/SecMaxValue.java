package stackkk;

import java.util.Scanner;

public class SecMaxValue {

	public static int Min(int arr[]) {
		int MinValue = Integer.MAX_VALUE;
		int SecMin= Integer.MAX_VALUE;
		int Thirdmin =Integer.MAX_VALUE;
		
		
		for (int value : arr) {	
			if(value < MinValue) {
				Thirdmin=SecMin;
				SecMin = MinValue;
				
				MinValue =value;
			}
//			}else if(value<MinValue && value>SecMin) {
//				SecMin=value;
//			}
			 else if (value < SecMin) {

				    Thirdmin = SecMin;
				    SecMin = value;

				} else if (value < Thirdmin) {

				    Thirdmin = value;
				}
		}
		return Thirdmin;
	}	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("eneter the number of length : \n");
		int size = scanner.nextInt();
		
		int [] arr = new int[size];
		
		for(int i=0 ; i<arr.length;i++) {
			
			System.out.println("enter the "+i+" value \n");
			arr[i]=scanner.nextInt();
		}
		
		
	System.out.println("\n \n");
	System.out.println(Min(arr));
	}
}
