// class uuu{
//      int x=99;
//     public double mal(){
//         final double pi=3.121423;
//         double r=2.43;
//         return pi*r*r ;

//     }
//     public int mm(){
//         int a=2;
//         return a;
//     }
//     public static void main(String[] args){
//         uuu x=new uuu();
//         double m=x.mal();
//         System.out.println(m);
//         int n=x.mm();
//         System.out.println(n);

//     }
// }


///// pass by value

// class gg{
//     public  void mma(int a){
//         System.out.println(a+a);
//     }
// }
// class uuu{
//     public static void main(String[] args){
//         int x=2222;
//        new gg().mma(x);
//     }
// }


//   pass by reference:

// class uuu{
//     int q =2330;
//     public static void mmm(uuu s2){
//         System.out.println(s2.q);
//     }
//     public static void main(String[] args){
//         uuu s1=new uuu();
//         System.out.println("the value is"+s1.q);
//         mmm(s1);
//     }
// }


//    pbf

class man{
    int x=728;
    int v=211;
}
class mmm{
    public static void add(man S2){
       int e=S2.x;
       int v=S2.v;
       int res=e+v;
       System.out.println("the value is : "+res);
    }
}
class sss{
    public static void sub(man s3){
        int g=s3.x;
        int f=s3.v;
        int rr=g-f;
        System.out.println("the value is : "+rr);
    }
}
class uuu{
    public static void main(String[] args) {
        man s1=new man();
        mmm.add(s1);
        sss.sub(s1);
    }
}