package WeightConverter;

import java.util.Scanner;

public class WeightConverter {
    public static double KgToLbConverter (double kg){
        return kg * 2.205;
    }

    public static double KgTogConverter (double kg){
        return kg * 1000;
    }

    public static double LbToKgConverter (double lb) {
        return lb / 2.205;
    }

    public static double LbTogConverter (double lb) {
        return lb * 454;
    }

    public static double gToKgConverter (double g) {
        return g / 1000;
    }

    public static double gToLbConverter (double g) {
        return g / 454;
    }

    public static void main(String[] args) {
        double output = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your value to convert: ");
        double userInp = scan.nextDouble();
        System.out.print("""
                1. Kilograms to Pounds\s
                2. Kilograms to Grams\s
                3. Pounds to Kilograms\s
                4. Pounds to Grams\s
                5. Grams to Kilograms\s
                6. Grams to Pounds\s
                Please select your conversion type:\s""");
        String userChoice = scan.next();

        if (userChoice.contentEquals( "1" ) ){
            output = KgToLbConverter( userInp );
        }else if(userChoice.contentEquals( "2" ) ) {
            output = KgTogConverter( userInp );
        }else if(userChoice.contentEquals( "3" ) ) {
            output = LbToKgConverter( userInp );
        }else if(userChoice.contentEquals( "4" ) ) {
            output = LbTogConverter( userInp );
        }else if(userChoice.contentEquals( "5" ) ) {
            output = gToKgConverter( userInp );
        }else if(userChoice.contentEquals( "6" ) ) {
            output = gToLbConverter( userInp );
        }else {
            System.out.println("The conversion you entered is not valid!");
        }

        System.out.print("Result: " +output);

    }
}
