import java.util.Scanner;

class ex {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the sentence buddy");
        String str = s1.nextLine();

        String[] s = str.split(" "); // split by words

        // for (int i = 0; i < s.length; i++)  reverse words not snetence {
        for(int i=s.length-1;i>=0;i--){
            System.out.print(revv(s[i]) + " ");
        }
    }

    static String revv(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }
        return res;
    }
}