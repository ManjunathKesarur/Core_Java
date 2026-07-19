import java.util.Scanner;

class Efl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double per = sc.nextDouble();

        if (per >= 85) {
            System.out.println("Distinction");
        } else if (per >= 60) {
            System.out.println("First Class");
        } else if (per >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
