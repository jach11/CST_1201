package Password;

import java.util.Scanner;
public class Password {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Do you have an account? Yes/No: ");
        String choice = input.next();
        String email = "";
        String password = "";
        if (choice.equalsIgnoreCase("no")) {
            System.out.println("Create Account");
            System.out.print("Enter your email: ");
            email = input.next();
            System.out.print("Enter your password: ");
            password = input.next();
        }
        System.out.println("Login to Account");
        System.out.print("Enter your email: ");
        String emailInp = input.next();
        int maxAttempts = 0;
        while (maxAttempts < 3) {
            System.out.print("Enter your password: ");
            String passwordInp = input.next();
            if (emailInp.equalsIgnoreCase(email) && passwordInp.equalsIgnoreCase(password)) {
                System.out.print("Successful login");
                break;
            } else {
                System.out.println("Wrong password!");
                maxAttempts++;
            }
        }
    }
}