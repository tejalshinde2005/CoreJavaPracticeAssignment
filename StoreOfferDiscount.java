package Package;

import java.util.Scanner;

public class StoreOfferDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get purchase amount
        System.out.print("Enter your purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        // Consume leftover newline before reading string input
        sc.nextLine(); 

        // Get loyalty status
        System.out.print("Enter your loyalty status (Gold, Silver, None): ");
        String loyaltyStatus = sc.nextLine();

        double discount = 0.0;

        // Check purchase-based discount
        if (purchaseAmount >= 500) {
            discount += 10.0;
        }

        // Check loyalty-based discount
        if (loyaltyStatus.equalsIgnoreCase("Gold")) {
            discount += 5.0;
        }

        // Print final discount
        System.out.print("Your total discount is " + discount + "%");

        // Optional: Explanation
        if (purchaseAmount >= 500 && loyaltyStatus.equalsIgnoreCase("Gold")) {
            System.out.println(" (10% from purchase + 5% from Gold status).");
        } else if (purchaseAmount >= 500) {
            System.out.println(" (10% from purchase only).");
        } else if (loyaltyStatus.equalsIgnoreCase("Gold")) {
            System.out.println(" (5% from Gold status only).");
        } else {
            System.out.println(".");
        }

        sc.close();
    }
}
