
import java.util.Scanner;

class pra{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the name of the Student :");
        String a=x.nextLine();
        System.out.println("enter the fees of the Student :");
        double b=x.nextDouble();
        x.nextLine();
        System.out.println("enter the address :");
        String c=x.nextLine();

        System.out.println("the name of the Student is: "+a);
        System.out.println("the fees of the Student is: "+b);
        System.out.println("the address is : "+c);
    }
}