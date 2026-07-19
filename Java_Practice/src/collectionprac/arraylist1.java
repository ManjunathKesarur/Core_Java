package collectionprac;

public class arraylist1 {
	
	static Object [] arr=new Object[10];
	static int index = 0;
	void add(Object a1) {
		arr[index]=a1;
	}
	public String lol() {
		String s1=" ";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null)
				s1=s1+arr[i]+" ";
		}
		return s1;
	}
	public boolean contains(Object obj) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(obj))
				return true;}
	return false;
	}

	public static void main(String[] args) {
	arraylist1 l1=new arraylist1();
	l1.add(10);
	l1.add(20);
	l1.add("manju");
	l1.add('A');
	System.out.println(l1.lol());

		
	}

}
