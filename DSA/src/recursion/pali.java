package recursion;

import java.util.Scanner;

interface om{

 void cell();
 public default  void aas() {
	System.out.println("mam"); 
 }
}
 class pop implements om{

	@Override
	public void cell() {
		System.out.println("manjunth");
		
	}	
}

 class UsertException extends Exception{
		public UsertException(String msg) {
			super(msg);
		}
		public UsertException() {
			
		}
	}
 
 class thre extends Thread{
	 public void tr() {
		 for(int i=1 ;i<=10 ;i++) {
			 try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			 System.out.println("hi"+i);
		 }
	 }
 }
 

public class pali   {
	
	public static boolean checkvovels(String ax) {
		return ax.toLowerCase().matches(".*[aeiou].*");
	}
	
public static <E> void main(String[] args) {
	
	om o=new pop();
	
	o.cell();
	o.aas();
	
//	String sr="mom";
//	
//	String rev ="";
//	
//	for(int i=sr.length()-1 ; i>=0 ;i--) {
//		rev=rev+sr.charAt(i);
//	}
//	
//	if(rev.equals(sr)) {
//		System.out.println("palindrome");
//		System.out.println(rev.length());
//	}else {
//		System.out.println("not palindrom");
//	}
	
	
//	int count=5;
//	
//	for (int i=1 ; i<=count ; i++) {
//
//		for(int j=1;j<=count-i;j++) {
//			System.out.print(" ");
//		}
//		for(int j=1;j<=i;j++) {
//			System.out.print("+ ");
//		}
//		   System.out.println();
//	}
	
//	int row=5;
//	
//	for (int i=1; i<=row;i++) {
//		for(int j=1;j<=row-i;j++) {
//			System.out.print(" ");
//		}
//		for(int j=1;j<=i;j++ ) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	System.out.println(checkvovels("TV"));
//	
//	int row =12;
//	
//	for(int i=1;i<=row;i++) {
//		for(int j=1;j<=row-i;j++) {
//			System.out.print(" ");
//		}
//		for(int j=1;j<=i;j++) {
//			System.out.print(" *");
//		}
//		
//		System.out.println();
//	}
	
	
//	String as="manjunath";
//	
//	String rev="";
//	
//	for(int i=as.length()-1;i>=0;i--) {
//		rev=rev+as.charAt(i);
//	}
//	
//	System.out.println(rev);
	
//	
//	String as="night";
//	String sa="thinag";
//	
//	char[] asa=	as.toCharArray();
//	char[] sas= sa.toCharArray();
//	
//	Arrays.sort(asa);
//	Arrays.sort(sas);
//
//	if(Arrays.equals(asa,sas)) {
//		System.out.println("anagram");
//	}else {
//		System.out.println("not");
//	}
	
//	int a=0,b=1;
//	
//	int num=10;
//	
//	for(int i=1 ;i<=num;i++) {
//		System.out.print(a +" ");
//	
//		int c=a+b;
//		a=b;
//		b=c;
//	
//	}
	
//		List<String> m=new LinkedList<String>(); 
//	ArrayList<Integer> as= new ArrayList<Integer>();
//	
//	
//as.add(12);
//
//as.add(1);
//as.add(1);
//
//as.remove(0);
//System.out.println(as);

//	StringBuilder builder=new StringBuilder();
//	builder.append("as");
//	builder.append(" asa");
//	
//	System.out.println(builder);
	
	try {
	String [] as=new String[10];
	as[0]="man";
	as[1]="mn";
	as[2]="ma";
	
	for(int i=0;i<=as.length;i++)
	System.out.println(as[i]);
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("fl");
	}
	
//	pali pal=new pali(id, name);
//	pal.go();
	pali a=new pali(1, "ama");

	pali b=new pali(1, "an");
	
	if(a.equals(b)) {
		System.out.println("correct");
	}else {
		System.out.println("not");
	}
	
	pali qa=new pali();
	
	qa.guru();
	qa.guru(12);
	
	int age = 19;

	try {
	    if (age < 21) {
	        throw new UsertException("Age must be 21 or above");
	    }

	    System.out.println("Major");

	} catch (UsertException e) {
	    System.out.println(e.getMessage());
	}
	
	thre aw=new thre();
	aw.tr();
}

final public void guru(int a) {
	System.out.println("man");
}
public void guru() {
	System.out.println("aaaa");
}


public pali() {
}

void  go()  {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the size");
	int size=	scanner.nextInt();
	String [] as=new String[size];
	
	for(int i=0;i<=as.length-1;i++) {
		System.out.println("eneter the element ");
		as[i] =scanner.next();
	}
	
	for(int i=0;i<as.length;i++)
	System.out.println(as[i]);	
}

int id;
String name;

public pali(int id,String name) {
	 this.id=id;
	 this.name=name;
}

public boolean equals(Object obj) {
		pali O = (pali) obj;	
	return this.id == O.id;
}
}








