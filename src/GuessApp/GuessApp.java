package GuessApp;

import java.util.Scanner;

public class GuessApp {
    public static void main(String[] args) {
        int secretNum = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int guessNum;
        do {
            System.out.println("Enter a guess between 1 - 100: ");
            guessNum = input.nextInt();
            if (guessNum == secretNum)
                System.out.println("You guessed " +secretNum +" correctly!");
            else if (guessNum > secretNum)
                System.out.println("The secret number is smaller than " +guessNum);
            else System.out.println("The secret number is larger than " +guessNum);
        }while (guessNum != secretNum);
    }
}