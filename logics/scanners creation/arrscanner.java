
import java.util.Scanner;

class arrscanner{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int a=s1.nextInt();
        int[] arr=new int[a];
        for  (int i=0;i<a;i++){
            System.out.println("enter the value of the index : "+i+"");
            arr[i]=s1.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("the index of "+i+" is : "+arr[i]);
        }
    }
}