
import java.util.Scanner;

class pr1{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the String budddy :");
        String s=s1.nextLine();
        String res="";
        for(int i=s.length()-1;i>=0;i--){
             res+=s.charAt(i);
        }
        if(s.equalsIgnoreCase(res)){
            System.out.println("its a palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}