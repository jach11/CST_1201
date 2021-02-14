package ByteConverter;

import java.util.Scanner;

public class ByteConverter {
    public static double GBToMBConverter (double GB){
        return GB * 1000;
    }

    public static double MBToKBConverter (double MB){
        return MB * 1000;
    }

    public static double KBToBConverter (double KB) {
        return KB * 1000;
    }

    public static double ByteToBitConverter (double Byte) {
        return Byte * 8;
    }

    public static void main(String[] args) {
        double output = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your value to convert: ");
        double userInp = scan.nextDouble();
        System.out.print("""
                1. Gigabytes to Megabytes\s
                2. Megabytes to Kilobytes\s
                3. Kilobytes to Bytes\s
                4. Bytes to Bits\s
                Please select your conversion type:\s""");
        String userChoice = scan.next();

        if (userChoice.contentEquals( "1" ) ){
            output = GBToMBConverter( userInp );
        }else if(userChoice.contentEquals( "2" ) ) {
            output = MBToKBConverter( userInp );
        }else if(userChoice.contentEquals( "3" ) ) {
            output = KBToBConverter( userInp );
        }else if(userChoice.contentEquals( "4" ) ) {
            output = ByteToBitConverter( userInp );
        }else {
            System.out.println("The conversion you entered is not valid!");
        }

        System.out.print("Result: " +output);

    }
}
