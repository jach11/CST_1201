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
        //Store user inputted operation as string
        String operation = scan.next();

        //Declare output as double
        double output = 0.0;
        if (operation.contentEquals("+")) {
            output = (num1 + num2);
        } else if (operation.contentEquals("-")) {
            output = (num1 - num2);
        } else if (operation.contentEquals("*")) {
            output = (num1 * num2);
        } else if (operation.contentEquals("/")) {
            output = (num1 / num2);
        } else {
            System.out.print("The operation you entered is not valid!");
        }
        System.out.print(num1+ " "+operation+" "+num2+ " = "+output);
    }
}