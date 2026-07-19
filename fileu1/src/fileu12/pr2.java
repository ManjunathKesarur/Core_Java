package fileu12;
import	fileu11.* ;
	
public class pr2 {
public static void main(String []args) {
	pr1 p=new pr1();
	p.cycle();
//	p.bike();
//	p.car();
//	p.atm();
	
	gg op=new gg();
	op.ppp();
	
	
}}
class gg extends pr1{
	void ppp() {
		super.bike();
	}
}

