import java.util.Scanner;
class pr2{
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("enter the String buddy :\n");
        Scanner s1=new Scanner(System.in);
        String s=s1.nextLine();
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        if(s.equalsIgnoreCase(res)){
            System.out.println("Yooooo the Sting is an palindrom buddy ");
                    System.out.println("-------------------------------------------------------------------");

        }else{
            System.out.println("Better luck next time");
                    System.out.println("-------------------------------------------------------------------");
        }

    }
}