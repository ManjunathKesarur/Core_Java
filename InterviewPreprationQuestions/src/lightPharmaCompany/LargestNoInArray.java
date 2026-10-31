package lightPharmaCompany;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class LargestNoInArray {

	
	public static void main(String[] args) {
		
//		for single lar and min :
		
//		int []arr= {1,2,3,14,5,6,7,8,9};
//		int Largest=arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>Largest) {
//				Largest=arr[i];
//			}
//		}
//		System.out.println(Largest);
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the Size Of an Array: \n");
		int size=scanner.nextInt();
		
		int [] arr= new int[size];
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("enter the values of an "+(i+1)+" array : ");
			
			arr[i]=scanner.nextInt();
		}
		
//		TreeSet<Integer> set=new TreeSet<Integer>(Comparator.reverseOrder());
//		
//		for(int num :arr) {
//			set.add(num);
//		}
//		
//		int n=2;
//		
//		if(set.size() < n) {
//			System.out.println("not enough");
//		}else {
//			for(int i=1;i<n;i++) {
//				set.pollLast();
//			}
//			
//			System.out.println("Third Largest id : "+set.last());
//		}
		
		Deque<Integer> queue=new ArrayDeque<Integer>();
		
		for(int a : arr)
		queue.offer(a);
		
//		int n=3;
//		
//		if(queue.size() < 3) {
//			System.out.println("enter the more capacity");
//		}else {
//			for(int i=1;i<n;i++) {
//				queue.poll();
//			}
//		}
		
		
		System.out.println(queue.peekFirst());
		
		
		
		
		
		
		
		
		
		
		
		
		//withot collection
		
//		int first=Integer.MIN_VALUE;
//		int second=Integer.MIN_VALUE;
//		int third=Integer.MIN_VALUE;
//		
//		
//		for(int num : arr) {
//		
//			if(	num == first || num ==second|| num==third) {
//				continue;
//			}
//			
//			if(num>first) {
//				third=second;
//				second=first;
//				first=num;
//				
//			}else if(num>second){
//				third=second;
//				second=num;
//			}else if(num>third) {
//				third=num;
//			}
//		}
//		
//		if(third == Integer.MIN_VALUE) {
//			System.out.println("\n");
//			System.out.println("not enought");
//		}else {
//			System.out.println("");
//			System.out.println(third+" is the 3rd largest");
//		}
		
		
		
	}
}
