import java.util.Scanner;

class Efl6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Alphabet");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }

        sc.close();
    }
}
