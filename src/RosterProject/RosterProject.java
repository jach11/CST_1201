package RosterProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RosterProject {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean menuOpen = true;
        do {
            System.out.println("""
                    Please select a program:
                    1. Print Full Roster Report\s
                    2. Print Full Roster Grades\s
                    3. Print Individual Student Report\s
                    0. Exit Program\s""");
            String userChoice = input.next();
            if (userChoice.contentEquals("1")) {
                printRosterReport();
            } else if (userChoice.contentEquals("2")) {
                printRosterGrade();
            } else if (userChoice.contentEquals("3")) {
                printStudentReport();
            } else if (userChoice.contentEquals("0")) {
                menuOpen = false;
            } else System.out.println("The option you selected is not valid!");
        } while (menuOpen);
    }

    private static void printRosterReport() throws IOException {
        String delimiter = ",";
        String fileInput = "src/RosterProject/class_roster_project.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            br.readLine(); //Skip header
            String contentLine;
            while ((contentLine = br.readLine()) != null) {
                contentLine = contentLine.replace("\"", ""); //Get rid of quotes
                contentLine = contentLine.replace("'", ""); //Get rid of quotes
                String[] student = contentLine.split(delimiter);
                System.out.printf("ID: %s | Name: %s %s | Quiz: %s | Test-1: %s | Mid-Term: %s | Test-3: %s | Final: %s | Presentation: %s | Project: %s%n", student[0], student[2], student[1], student[3], student[4], student[5], student[6], student[7], student[8], student[9]);
            }
        }
    }
    private static void printRosterGrade() throws IOException {
        String delimiter = ",";
        String fileInput = "src/RosterProject/class_roster_project.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            br.readLine(); //Skip header
            String contentLine;
            while ((contentLine = br.readLine()) != null) {
                contentLine = contentLine.replace("\"", ""); //Get rid of quotes
                contentLine = contentLine.replace("'", ""); //Get rid of quotes
                String[] student = contentLine.split(delimiter);
                double quiz = Double.parseDouble(student[3]);
                double test1 = Double.parseDouble(student[4]);
                double midterm = Double.parseDouble(student[5]);
                double test3 = Double.parseDouble(student[6]);
                double finalexam = Double.parseDouble(student[7]);
                double presentation = Double.parseDouble(student[8]);
                double project = Double.parseDouble(student[9]);
                double convertedQuiz = (quiz / 10 * 100);
                double convertedTest1 = (test1 / 50 * 100);
                double convertedMidterm = (midterm / 50 * 100);
                double convertedTest3 = (test3 / 30 * 100);
                double convertedFinalexam = (finalexam / 50 * 100);
                double convertedPresentation = (presentation / 2 * 100);
                double convertedProject = (project / 6 * 100);
                double quizWeight = .02;
                double test1Weight = .10;
                double midtermWeight = .30;
                double test3Weight = .10;
                double finalexamWeight = .40;
                double presentationWeight = .02;
                double projectWeight = .06;
                double finalGrade = (quizWeight * convertedQuiz)+(test1Weight * convertedTest1)+(midtermWeight * convertedMidterm)+(test3Weight * convertedTest3)+(finalexamWeight * convertedFinalexam)+(presentationWeight * convertedPresentation)+(projectWeight * convertedProject);
                System.out.printf("ID: " +student[0] +" Grade: %.2f\n", +finalGrade);
            }
        }
    }
    private static void printStudentReport() throws IOException {
        String delimiter = ",";
        String fileInput = "src/RosterProject/class_roster_project.csv";
        List<List<String>> rosterList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            br.readLine(); //Skip header
            String contentLine;
            while ((contentLine = br.readLine()) != null) {
                contentLine = contentLine.replace("\"", ""); //Get rid of quotes
                contentLine = contentLine.replace("'", ""); //Get rid of quotes
                String[] student = contentLine.split(delimiter);
                rosterList.add(Arrays.asList(student));
            }
            Scanner input = new Scanner(System.in);
            boolean menuOpen = true;
            do {
                System.out.print("Please Enter Student ID: ");
                String studentID = input.next();
                for (List list : rosterList) {
                    if (list.contains(studentID)) {
                        System.out.printf("ID: %s | Name: %s %s | Quiz: %s | Test-1: %s | Mid-Term: %s | Test-3: %s | Final: %s | Presentation: %s | Project: %s%n", list.get(0), list.get(2), list.get(1), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9));
                        menuOpen = false;
                    }
                }
            } while (menuOpen);
        }
    }
}