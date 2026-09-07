package corestuff;


public class exuu {
	
	static void checkAge(int age) throws Exception{
		if(age>32) {
			throw new Exception("eligible");
		}else {
			throw new Exception("not eligible"); 
		}
	}
	
public static void main(String[] args) {
		
	try {
		checkAge(121);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

}
}
