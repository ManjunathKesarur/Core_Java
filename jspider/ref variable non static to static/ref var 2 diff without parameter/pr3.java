class m1{
    double circle(){
        double r=4.35;
        double pi=3.1422;
        double result=pi*r*r;
        return result;
        
    }}
class m2{
     double triangle() {
    double b=3.142;
    double h=6.123;
    double result=0.5*b*h;
    return result;
    }
}
class m3{
	public double square(){
		int a=3;
		double result=a*a;
		return result;
}}
class m4{
	public double parallelogram(){;
		int b=13 ; double h=12.66;
		double result=b*h;
		return result;
}}
class m5{
    public double rectangle() {
    double w=3.142;
    double h=6.123;
    double r=w*h;
    return r;
    } 
}
class m6{
    public double trapezoid() {
    double a=4.32;
    double b=3.142;
    double h=6.123;
    double r=0.5*(a+b)*h;
    return r;
    } 
}
class m7{
    public double sector() {
    double r=3.142;
    double ti=60.123;
    double re=0.5*r*r*ti;
    return re;
    } 
}
class m8{
    public double ellipse() {
    double pi=3.142;
    double a=6.123;
    double b=4.56;
    double r=pi*a*b;
    return r;
    } 
}
 class pr3{
    public static void main(String[] args) {
        double x = new m1().circle();
        System.out.println(x);
              double y = new m2().triangle();
        System.out.println(y);
              double m = new m3().square();
        System.out.println(m);
              double n = new m4().parallelogram();
        System.out.println(n);
              double o = new m5().rectangle();
        System.out.println(o);
              double p = new m6().trapezoid();
        System.out.println(p);
              double q = new m7().sector();
        System.out.println(q);
              double r = new m8().ellipse();
        System.out.println(r);
   
        
    }
 }