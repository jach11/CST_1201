package GradeCalc;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your percent grade to convert: ");
        double percentGrade = scan.nextDouble();

        if (percentGrade >= 97 && percentGrade <=100) {
            System.out.print("Letter Grade: A+");
        }
        else if (percentGrade >= 93 && percentGrade <=96) {
            System.out.print("Letter Grade: A");
        }
        else if (percentGrade >= 90 && percentGrade <=92) {
            System.out.print("Letter Grade: A-");
        }
        else if (percentGrade >= 87 && percentGrade <=89) {
            System.out.print("Letter Grade: B+");
        }
        else if (percentGrade >= 83 && percentGrade <=86) {
            System.out.print("Letter Grade: B");
        }
        else if (percentGrade >= 80 && percentGrade <=82) {
            System.out.print("Letter Grade: B-");
        }
        else if (percentGrade >= 77 && percentGrade <=79) {
            System.out.print("Letter Grade: C+");
        }
        else if (percentGrade >= 73 && percentGrade <=76) {
            System.out.print("Letter Grade: C");
        }
        else if (percentGrade >= 70 && percentGrade <=72) {
            System.out.print("Letter Grade: C-");
        }
        else if (percentGrade >= 67 && percentGrade <=69) {
            System.out.print("Letter Grade: D+");
        }
        else if (percentGrade >= 65 && percentGrade <=66) {
            System.out.print("Letter Grade: D");
        }
        else if (percentGrade >= 0 && percentGrade <=64) {
            System.out.print("Letter Grade: F");
        }
        else System.out.print("The percent grade you entered is not valid!");

    }

}