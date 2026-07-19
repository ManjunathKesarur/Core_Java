class m1{
    void circle(double r){
        double pi=3.1422;
        double result=pi*r*r;
        System.out.println(result);
    }}
class m2{
    public void triangle(double b,double h) {
    double r=0.5*b*h;
    System.out.println(r);
    }
}
class m3{
	public void square(double a){
		double result=a*a;
		System.out.println(result);
}}
class m4{
	public void parallelogram(double b , double h){;
		double result=b*h;
		System.out.println(result);
}}
class m5{
    public void rectangle(double w,double h) {
    double r=w*h;
    System.out.println(r);
    } 
}
class m6{
    public void trapezoid(double a,double b,double h) {
    double r=0.5*(a+b)*h;
    System.out.println(r);
    } 
}
class m7{
    public void sector( double r,double ti) {
    double re=0.5*r*r*ti;
    System.out.println(re);
    } 
}
class m8{
    public void ellipse(double a,double b) {
    double pi=3.142;
    double r=pi*a*b;
    System.out.println(r);
    } 
}
 class pr2{
    public static void main(String[] args) {
        new m1().circle(4.5);
        new m2().triangle(0.5,1.87);
        new m3().square(6.67);
        new m4().parallelogram(9.8,7.6);
        new m5().rectangle(9,18);
        new m6().trapezoid(4,5,9.2);
        new m7().sector(5.45,71.45);
        new m8().ellipse(3.5,7);
        
    }
 }