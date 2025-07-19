package assigment2;

import java.util.Scanner;

public class Commission {
    // Data Members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept sales employee details
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();
    }

    // Method to calculate commission
    public void calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }

        System.out.println("Commission for " + name + " is: ₹" + commission);
    }
}
