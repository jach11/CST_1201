package GuessApp;

import java.util.Scanner;

public class GuessAppv2 {

    public static void main(String[] args) {
/*        int secretNum = (int) (Math.random() * 100);*/
        int secretNum = 60;
        Scanner input = new Scanner(System.in);
        int humanGuessNum;
        int cpuGuessNum;
        int humanGuessCount = 0;
        int cpuGuessCount = 0;
        int humanGuessLimit = 9;
        int cpuGuessLimit = 9;
        int upperLimit = 100;
        int lowerLimit = 0;
        do {
            System.out.println("Enter a guess between 0 - 100: ");
            humanGuessNum = input.nextInt();
            cpuGuessNum = (lowerLimit + upperLimit) / 2;
            //Human Logic
            if (humanGuessNum == secretNum) {
                humanGuessCount++;
                System.out.println("You Win!");
                System.out.println("You guessed " + secretNum + " correctly!");
                System.out.println("It took you " + humanGuessCount + " tries to guess correctly");
                break;
            } else if (humanGuessNum > secretNum) {
                System.out.println("The secret number is smaller than " + humanGuessNum);
                humanGuessCount++;
                System.out.println("You have " + (humanGuessLimit - humanGuessCount) + " tries left");
            } else {
                System.out.println("The secret number is larger than " + humanGuessNum);
                humanGuessCount++;
                System.out.println("You have " + (humanGuessLimit - humanGuessCount) + " tries left");
            }

            //CPU Logic
            if (cpuGuessNum == secretNum) {
                cpuGuessCount++;
                System.out.println("You Lose!");
                System.out.println("The computer guessed " + secretNum + " correctly!");
                System.out.println("It took the computer " + cpuGuessCount + " tries to guess correctly");
                break;
            } else if (cpuGuessNum > secretNum) {
                System.out.println("The computer guessed " + cpuGuessNum);
                upperLimit = cpuGuessNum;
                cpuGuessCount++;
            } else if (cpuGuessCount == cpuGuessLimit) {
                System.out.println("You Win!");
                System.out.println("The computer ran out of guesses");
                System.out.println("The secret number was " +secretNum);
                break;
            } else {
                System.out.println("The computer guessed " + cpuGuessNum);
                lowerLimit = cpuGuessNum;
                cpuGuessCount++;
            }
        } while (humanGuessCount != humanGuessLimit);
    }
}