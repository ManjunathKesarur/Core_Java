import java.util.Scanner;
class withoutinbuilt{
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
     String s=y.nextLine();
     char x[]=s.toCharArray();
     int i=0, j=s.length()-1;
    while(i<j){
        if(x[i]!=x[j]){
            System.out.println("its not an pallindrom");
        return;
        }
        i++;
        j--;

    }System.out.println("pallindrom");
    }
}