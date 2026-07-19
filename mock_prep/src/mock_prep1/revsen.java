package mock_prep1;

public class revsen {

	public static void main(String[] args) {
		String s="man is good boy";
		String rev=" ";
		String [] arr=s.split(" ");
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
