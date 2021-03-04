package RangeApp;

import java.util.Scanner;

public class RangeApp {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = input.nextInt();
        System.out.print("Enter the ending number: ");
        int end = input.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        String winner;
        if (evenSum > oddSum) {
            winner = "even";
        } else winner = "odd";
        System.out.print("What's the larger sum, even or odd?: ");
        String userGuess = input.next();
        if (userGuess.equals(winner)) {
            System.out.println("Congratulations! You're correct!");
        }
        else {
            System.out.println("Sorry! You're incorrect!");
        }

        System.out.println("The sum of all even numbers between " +start+ " and " +end+ " is " +evenSum);
        System.out.println("The sum of all odd numbers between " +start+  " and " +end+ " is " +oddSum);
    }
}