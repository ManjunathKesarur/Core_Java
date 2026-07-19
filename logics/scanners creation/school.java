
import java.util.Scanner;

class school{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the name of the student : ");
        String a = x.next();
        System.out.println("enter the id of the Student : ");
        int y=x.nextInt();
        System.out.println("Enter the 'Sec' of the Student : ");
        char b= x.next().charAt(0);
        System.out.println("Enter the fees of the Student : ");
        double c=x.nextDouble();
        x.nextLine();
        System.out.println("enter the address : ");
        String d=x.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + a);
        System.out.println("ID: " + y);
        System.out.println("Section: " + b);
        System.out.println("Fees: " + c);
        System.out.println("Address: " + d);
    }
}