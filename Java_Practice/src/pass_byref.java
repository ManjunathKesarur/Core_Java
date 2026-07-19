class man{
	int y=3243;
}
class lo{
 void lplp(man s1) {
	 System.out.println(s1.y);
 }
}
public class pass_byref {

	public static void main(String[] args) {
man m=new man();
lo p=new lo();
p.lplp(m);

	}

}
