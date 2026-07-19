class m1{
    void circle(){
        double r=4.35;
        double pi=3.1422;
        double result=pi*r*r;
        System.out.println(result);
    }}
class m2{
    public void triangle() {
    double b=3.142;
    double h=6.123;
    double r=0.5*b*h;
    System.out.println(r);
    }
}
class m3{
	public void square(){
		int a=3;
		double result=a*a;
		System.out.println(result);
}}
class m4{
	public void parallelogram(){;
		int b=13 ; double h=12.66;
		double result=b*h;
		System.out.println(result);
}}
class m5{
    public void rectangle() {
    double w=3.142;
    double h=6.123;
    double r=w*h;
    System.out.println(r);
    } 
}
class m6{
    public void trapezoid() {
    double a=4.32;
    double b=3.142;
    double h=6.123;
    double r=0.5*(a+b)*h;
    System.out.println(r);
    } 
}
class m7{
    public void sector() {
    double r=3.142;
    double ti=60.123;
    double re=0.5*r*r*ti;
    System.out.println(re);
    } 
}
class m8{
    public void ellipse() {
    double pi=3.142;
    double a=6.123;
    double b=4.56;
    double r=pi*a*b;
    System.out.println(r);
    } 
}
 class pr1{
    public static void main(String[] args) {
        new m1().circle();
        new m2().triangle();
        new m3().square();
        new m4().parallelogram();
        new m5().rectangle();
        new m6().trapezoid();
        new m7().sector();
        new m8().ellipse();
        
    }
 }