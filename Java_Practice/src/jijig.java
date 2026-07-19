class Demo {
     void mom() {
        System.out.println("hi bro how are you");
    }
}
class test{
	void lol(Demo s1) {
		
	s1.mom();
	s1.mom();
	s1.mom();
	s1.mom();
	s1.mom();
	s1.mom();
}}

public class jijig {
    public static void main(String[] args) {
       new Demo().mom();
       Demo s1=new Demo();
       
      new test().lol(s1);
    }
}