package collectionprac;

public class sample3 {
	static Object [] arr;
	sample3 (Object [] arr){
		this.arr=arr;
		System.out.println("constructor is called");
	}
	public static void main(String[] args) {
		sample3 s=new sample3(new Object [10]);
		arr[0]=10;
		arr[1]=20.5;
		arr[2]="manunath";
		arr[3]=true;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.println("-----------------------------");
		}
	}

}
