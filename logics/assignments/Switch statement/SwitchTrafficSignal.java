import java.util.Scanner;

class SwitchTrafficSignal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal color (red/yellow/green): ");
        String color = sc.next().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal");
        }

        sc.close();
    }
}
