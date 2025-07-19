package airfareapp;

import java.util.Scanner;

public class Main {  // 👈 You missed this class declaration

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice (1-AirIndia, 2-KingFisher, 3-Indigo):");
        int choice = Integer.parseInt(sc.nextLine());

        System.out.println("Enter number of hours:");
        int hours = Integer.parseInt(sc.nextLine());

        System.out.println("Enter cost per hour:");
        double costPerHour = Double.parseDouble(sc.nextLine());

        Airfare airfare = null;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }

        airfare.display();
        sc.close();
    }
}
