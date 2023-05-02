import JAVAOO.IamNatri.com.github.OODataStructures.CreditCard.CreditCard;
import JAVAOO.IamNatri.com.github.OODataStructures.CreditCard.Purchase;

import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit of the Credit Card: ");
        double limit = scanner.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while(exit != 0) {
            System.out.println("Enter purchase description:");
            String description = scanner.next();

            System.out.println("\n enter the purchase amount:");
            double value = scanner.nextDouble();

            Purchase purchase = new Purchase(description, value);
            boolean PurchaseMade = card.upPurchase(purchase);

            if (PurchaseMade) {
                System.out.println("Purchase made!");
                System.out.println("enter 0 to exit or 1 to continue");
                exit = scanner.nextInt();
            } else {
                System.out.println("Non-Sufficient Fund!");
                exit = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("Purchases made:\n");
        Collections.sort(card.getPurchases());
        for (Purchase c : card.getPurchases()) {
            System.out.println(c.getDescription() + " - " +c.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nFund in CreditCard: " +card.getbalance());
    }
    }
