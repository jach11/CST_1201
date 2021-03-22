package WheelApp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WheelApp {
    public static void main(String[] args) {

        ArrayList<Integer> evenList = new ArrayList<>(50);
        ArrayList<Integer> oddList = new ArrayList<>(50);
        Random random = new Random();

        //Generate and store random even numbers
        for (int i = 0; i < 50; i++) {
            Integer evenNum = (random.nextInt((100) / 2) * 2);
            evenList.add(evenNum);
        }

        //Generate and store random odd numbers
        for (int i = 0; i < 50; i++) {
            Integer oddNum = (random.nextInt((100) / 2) * 2) + 1;
            oddList.add(oddNum);
        }

        int evenTotal = 0;
        //Calculate the even total
        for (int evenNum : evenList) {
            evenTotal += evenNum;
        }

        int oddTotal = 0;
        //Calculate the odd total
        for (int oddNum : oddList) {
            oddTotal += oddNum;
        }

        Scanner input = new Scanner(System.in);
        //Check for the winner
        String winner;
        if (evenTotal > oddTotal) {
            winner = "even";
        } else winner = "odd";
        System.out.println("What's the larger total, even or odd?: ");
        String userGuess = input.next();
        if (userGuess.equals(winner)) {
            System.out.println("Congratulations! You're correct!");
        }
        else {
            System.out.println("Sorry! You're incorrect!");
        }

        System.out.println("Even total: " +evenTotal);
        System.out.println("Odd total: " +oddTotal);

        /* Debugging */
/*        for (int value : evenList) System.out.println(value);
        for (int value : oddList) System.out.println(value);
        System.out.println("Even List Size: " +evenList.size());
        System.out.println("Odd List Size: " +oddList.size());*/

    }
}