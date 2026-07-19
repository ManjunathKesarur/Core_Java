import java.util.Scanner;

class m1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nested if programs Choice");
        System.out.println("1. Check positive AND even");
        System.out.println("2. Check pass AND distinction (>85)");
        System.out.println("3. Alphabet -> vowel or consonant");
        System.out.println("4. Age >=18 -> allow voting");
        System.out.println("5. Mobile unlocked -> check password");
        System.out.println("6. Divisible by 2 and 4");
        System.out.println("7. Salary >50000 AND experience >5");
        System.out.println("8. 3-digit number -> palindrome check");
        System.out.println("9. Leap year -> check century");
        System.out.println("10. Bank account -> verify PIN");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                if (num > 0) {
                    if (num % 2 == 0)
                        System.out.println("Positive and Even");
                }
                break;

            case 2:
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                if (marks >= 35) {
                    if (marks > 85)
                        System.out.println("Pass with Distinction");
                }
                break;

            case 3:
                System.out.print("Enter character: ");
                char ch = sc.next().charAt(0);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    if ("aeiouAEIOU".indexOf(ch) != -1)
                        System.out.println("Vowel");
                    else
                        System.out.println("Consonant");
                }
                break;

            case 4:
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                if (age >= 18) {
                    if (age >= 18)
                        System.out.println("Allowed to Vote");
                }
                break;

            case 5:
                System.out.print("Is mobile unlocked? (true/false): ");
                boolean unlocked = sc.nextBoolean();
                if (unlocked) {
                    System.out.print("Enter password: ");
                    int pass = sc.nextInt();
                    if (pass == 1234)
                        System.out.println("Access Granted");
                }
                break;

            case 6:
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    if (n % 4 == 0)
                        System.out.println("Divisible by 2 and 4");
                }
                break;

            case 7:
                System.out.print("Enter salary: ");
                int salary = sc.nextInt();
                if (salary > 50000) {
                    System.out.print("Enter experience (years): ");
                    int exp = sc.nextInt();
                    if (exp > 5)
                        System.out.println("Eligible for Promotion");
                }
                break;

            case 8:
                System.out.print("Enter 3-digit number: ");
                int number = sc.nextInt();
                if (number >= 100 && number <= 999) {
                    int rev = 0, temp = number;
                    while (temp != 0) {
                        rev = rev * 10 + temp % 10;
                        temp /= 10;
                    }
                    if (rev == number)
                        System.out.println("Palindrome Number");
                }
                break;

            case 9:
                System.out.print("Enter year: ");
                int year = sc.nextInt();
                if (year % 4 == 0) {
                    if (year % 100 != 0 || year % 400 == 0)
                        System.out.println("Leap Year");
                }
                break;

            case 10:
                System.out.print("Do you have account? (true/false): ");
                boolean account = sc.nextBoolean();
                if (account) {
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();
                    if (pin == 1111)
                        System.out.println("Withdrawal Allowed");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}