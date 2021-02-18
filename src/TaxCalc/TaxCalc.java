package TaxCalc;

import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args) {
        double NY_RATE = .08875;
        double NJ_RATE = .06625;
        double CT_RATE = .0635;
        double MA_RATE = .0625;
        double PA_RATE = .06;
        double CA_RATE = .0725;
        double TX_RATE = .0625;
        double FL_RATE = .06;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the cost of your item: ");
        double itemCost = input.nextDouble();
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

        double totalCost;
        if (stateChoice.contentEquals("1")) {
            totalCost = ((NY_RATE * itemCost) + itemCost);
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("2")) {
            totalCost = (NJ_RATE * itemCost) + itemCost;
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("3")) {
            totalCost = (CT_RATE * itemCost) + itemCost;
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("4")) {
            totalCost = (MA_RATE * itemCost) + itemCost;
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("5")) {
            totalCost = (PA_RATE * itemCost) + itemCost;
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("6")) {
            totalCost = (CA_RATE * itemCost) + itemCost;
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("7")) {
            totalCost = (TX_RATE * itemCost) + itemCost;
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else if (stateChoice.contentEquals("8")) {
            totalCost = (FL_RATE * itemCost) + itemCost;
            System.out.printf("Total Cost = $%.2f\n", +totalCost);
        } else System.out.print("The state you selected is not valid!");
    }
}