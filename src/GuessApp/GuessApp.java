package GuessApp;

import java.util.Scanner;

public class GuessApp {
    public static void main(String[] args) {
        int secretNum = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int guessNum;
        int guessCount = 1;
        do {
            System.out.println("Enter a guess between 1 - 100: ");
            guessNum = input.nextInt();
            if (guessNum == secretNum) {
                System.out.println("You guessed " + secretNum + " correctly!");
                System.out.println("It took you " + guessCount + " tries to guess correctly");
            } else if (guessNum > secretNum) {
                System.out.println("The secret number is smaller than " + guessNum);
                guessCount++;
            }
            else {
                System.out.println("The secret number is larger than " +guessNum);
                guessCount++;
            }
        }while (guessNum != secretNum);
    }
}