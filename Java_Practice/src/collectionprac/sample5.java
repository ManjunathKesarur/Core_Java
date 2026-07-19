package collectionprac;

public class sample5 {
		static Object[] arr=new Object[10000];
		static int index=0;
		static void up(Object a) {
			arr[index]=a;
			index++;
		}
	public static void main(String[] args) {
	up(10);
	up((byte)20);
	up(20.5);
	up("manunath");
    up(1);
    up(2);
    up(3);
    up(4);
    up(5);
    up(6);
    up(7);
    up(8);
    up(9);
    up(10);
    up(11);
    up(12);
    up(13);
    up(14);
    up(15);
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=null)
	System.out.println(arr[i]);
}}}
