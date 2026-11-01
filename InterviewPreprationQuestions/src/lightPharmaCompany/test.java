package lightPharmaCompany;

import java.util.TreeSet;

public class test {
public static void main(String[] args) {
//	int arr[]= {10,20,30,40,50};
//	
//	int start=3;
//	
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[(start+i)%arr.length]+" ");
//	}
	
	
//	int arr[][]= {
//			{1,2,3},
//			{4,5,6},
//			{7,8,9}
//	};
//	
//	int n=arr.length;
//	int sum=0;
//	
//	for(int i=0;i<arr.length;i++) {
//		
//		sum+=arr[i][i];
//		
//		if(i!=n-1-i) {
//			sum+=arr[i][n-1-i];
//		}
//		
//	}
//	System.out.println(sum);


//String name="aaaabbbccc";
//int count=1;
//for(int i=0;i<name.length()-1;i++) {
//
//	if(name.charAt(i)==name.charAt(i+1))
//	count++;
//	else {
//		System.out.print(name.charAt(i)+""+count);
//		count=1;
//	}
//}
//
//System.out.print(name.charAt(name.length()-1)+""+count);
	
	
	
//int [] arr= {10,20,30,40,50,60};
//
//int mid=arr.length/2;
//
//System.out.print(arr[mid]+" ");
//
//for(int i=1;i<arr.length;i++) {
//	
//	if(mid-i >=0)
//	System.out.print(arr[mid-i]+" ");
//	
//	if(mid+i<arr.length)
//	System.out.print(arr[mid+i]+" ");
//}
	
int [] arr= {12,40,30,30,20};

int first=Integer.MIN_VALUE;
int second=Integer.MIN_VALUE;
int third=Integer.MIN_VALUE;

for(int i = 0; i < arr.length; i++)
System.out.println(arr[i]);
	
for(int num : arr ){
	
	if(num == first || num==second || num==third) {
		continue;
	}else if(num>=first) {
		third=second;
		second=first;
		first=num;
	}else if(num>=second) {
		third=second;
		second=num;
	}else if(num>=third) {
		third=num;
	}
}
System.out.println(third);




//int n=2;	
//	
//TreeSet<Integer> set=new TreeSet<Integer>();
//
//for(int i=0;i<arr.length;i++) {
//	set.add(arr[i]);
//}
//
//if(set.size()<n) {
//	
//	}else {
//		for(int i=1;i<n;i++) {
//		set.pollLast();
//		}
//	}
//System.out.println(set.last());
	
	
//int odd=0,even=0;
//
//for(int i=1;i<=3;i++) {
//	if(i%2==0) {
//		even++;
//	}else {
//		odd++;
//	}
//}
//System.out.println(odd);System.out.println(even);




}
}
