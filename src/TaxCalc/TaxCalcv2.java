package TaxCalc;

import java.util.Scanner;

public class TaxCalcv2 {
    public static void main(String[] args) {
        double NY_RATE = .08875;
        double NJ_RATE = .06625;
        double CT_RATE = .0635;
        double MA_RATE = .0625;
        double PA_RATE = .06;
        double CA_RATE = .0725;
        double TX_RATE = .0625;
        double FL_RATE = .06;
        double shippingCost = 15;
        double subtotalCost;
        double totalCost;

        Scanner input = new Scanner(System.in);
        boolean addItems = true;
        double itemCost = 0;
        while (addItems){
            System.out.print("Enter item price: ");
            double additionalCost = input.nextDouble();
            itemCost += additionalCost;
            System.out.print("""
                            1. Yes\s
                            2. No\s
                            Would you like to add more items?:\s""");
            String userChoice = input.next();
            if(userChoice.contentEquals("2")) {
                addItems = false;
            }
        }
        System.out.print("""
                1. New York\s
                2. New Jersey\s
                3. Connecticut\s
                4. Massachusetts\s
                5. Pennsylvania\s
                6. California\s
                7. Texas\s
                8. Florida\s
                Please select your state:\s""");
        String stateChoice = input.next();

        if (stateChoice.contentEquals("1")) {
            subtotalCost = ((NY_RATE * itemCost) + itemCost);
            if(subtotalCost >= 100) {
                totalCost = subtotalCost;
            }
            else {
                totalCost = (subtotalCost + shippingCost);
            }
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("2")) {
            subtotalCost = ((NJ_RATE * itemCost) + itemCost);
            if(subtotalCost >= 100) {
                totalCost = subtotalCost;
            }
            else {
                totalCost = (subtotalCost + shippingCost);
            }
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("3")) {
            subtotalCost = ((CT_RATE * itemCost) + itemCost);
            if(subtotalCost >= 100) {
                totalCost = subtotalCost;
            }
            else {
                totalCost = (subtotalCost + shippingCost);
            }
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("4")) {
            subtotalCost = ((MA_RATE * itemCost) + itemCost);
            if(subtotalCost >= 100) {
                totalCost = subtotalCost;
            }
            else {
                totalCost = (subtotalCost + shippingCost);
            }
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("5")) {
            subtotalCost = ((PA_RATE * itemCost) + itemCost);
            if(subtotalCost >= 100) {
                totalCost = subtotalCost;
            }
            else {
                totalCost = (subtotalCost + shippingCost);
            }
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("6")) {
            subtotalCost = ((CA_RATE * itemCost) + itemCost);
            if(subtotalCost >= 100) {
                totalCost = subtotalCost;
            }
            else {
                totalCost = (subtotalCost + shippingCost);
            }
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("7")) {
            subtotalCost = ((TX_RATE * itemCost) + itemCost);
            if(subtotalCost >= 100) {
                totalCost = subtotalCost;
            }
            else {
                totalCost = (subtotalCost + shippingCost);
            }
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("8")) {
            subtotalCost = ((FL_RATE * itemCost) + itemCost);
            if(subtotalCost >= 100) {
                totalCost = subtotalCost;
            }
            else {
                totalCost = (subtotalCost + shippingCost);
            }
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else System.out.print("The state you selected is not valid!");
    }
}