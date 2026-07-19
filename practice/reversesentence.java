import java.util.Scanner;
class reversesentence{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value : \n");
        String str=s1.nextLine();
        String arr[]=str.split(" ");
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

}