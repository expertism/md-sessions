package org.mdigital;
import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your hour: ");
        String userHour = scanner.nextLine();

        try {
            int userInput = Integer.parseInt(userHour);
            if (userInput > 0 && userInput <= 5) {
                System.out.println("Cost: £300");
            } else if (userInput > 5 && userInput <= 10) {
                System.out.println("Cost: £350");
            } else if (userInput > 10 && userInput <= 15) {
                System.out.println("Cost: £500");
            } else if (userInput > 15 && userInput <= 20) {
                System.out.println("Cost: £700");
            } else if (userInput > 20) {
                System.out.println("Cost: £400");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid whole number.");
        }

        scanner.close();
    }
}
