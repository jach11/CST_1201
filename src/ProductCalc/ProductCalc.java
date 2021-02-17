package ProductCalc;

import java.util.Scanner;

public class ProductCalc {
    public static void main(String[] args) {
        double prod1, prod2;
        System.out.print("Please enter the cost of product 1: ");
        Scanner scan = new Scanner(System.in);
        prod1 = scan.nextDouble();
        System.out.print("Please enter the cost of product 2: ");
        prod2 = scan.nextDouble();
        double total = (prod1 + prod2);
        System.out.print(prod1+ " + " +prod2 + " = "+total);
    }
}