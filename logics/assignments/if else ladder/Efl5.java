import java.util.Scanner;

class Efl5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        if (salary >= 80000) {
            System.out.println("Senior Level");
        } else if (salary >= 50000) {
            System.out.println("Mid Level");
        } else if (salary >= 25000) {
            System.out.println("Junior Level");
        } else {
            System.out.println("Entry Level");
        }

        sc.close();
    }
}
