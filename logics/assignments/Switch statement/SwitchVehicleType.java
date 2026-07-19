import java.util.Scanner;

class SwitchVehicleType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of wheels: ");
        int wheels = sc.nextInt();

        switch (wheels) {
            case 2:
                System.out.println("Two Wheeler (Bike/Scooter)");
                break;
            case 3:
                System.out.println("Three Wheeler (Auto)");
                break;
            case 4:
                System.out.println("Four Wheeler (Car)");
                break;
            default:
                System.out.println("Other Type of Vehicle");
        }

        sc.close();
    }
}
