
import java.util.Scanner;

class onethree{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value: ");
        String s=s1.nextLine();
        String res="";
        for (int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
     if(res.equalsIgnoreCase(s)){
        System.out.println("pallindrom");
     }
     else{
        System.out.println("not a pallindrom");
     }
    }
}