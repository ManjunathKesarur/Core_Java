
import java.util.Scanner;

abstract     class openhim{
abstract void movie();   
abstract int price(int op); 

    public openhim() {
    System.out.println("Hi");
    }


}
  class abstracmeth extends openhim{
   void movie(){
        System.out.println("hello");
    }
    int price(int op){
        return op+op+op;
    }

    public abstracmeth() {
        System.out.println("envoked");
    }
    

    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.println("enter the value");
        int xa= sc.nextInt();


        abstracmeth a= new abstracmeth();
        a.movie();
       int x= a.price(xa);
       System.out.println(x); 


    }
}

