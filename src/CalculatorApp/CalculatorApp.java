package CalculatorApp;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        //Store two numbers
        double num1, num2;
        Scanner scan = new Scanner(System.in);
        //Input first number
        System.out.print("Please enter first number: ");
        num1 = scan.nextDouble();
        //Input second number
        System.out.print("Please enter second number: ");
        num2 = scan.nextDouble();
        //Input operation
        System.out.print("Select an operation +, -, *, /: ");
        //Store char that user inputted as operation using index 0
        char operation = scan.next().charAt(0);
        //Close user input
        scan.close();

        //Store answer
        double answer;
        //Make this cleaner with a switch, breaks stop execution once match is found.
        //I wanted to make this inside a loop but i couldn't figure it out, this will have to suffice.
        //Operation Logic
        switch (operation) {
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> answer = num1 / num2;
            default -> {
                System.out.print("The operation you entered is not valid!");
                return;
            }
        }
        //Print the answer to the user with their chosen input concatenated
        //I'd like to figure out how to do formatting so that values without decimals aren't shown
        System.out.print(num1+" "+operation+" "+num2+" = "+answer);
    }
}
