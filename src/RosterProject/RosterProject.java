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
                    2. Print Individual Student Report * STILL IN DEVELOPMENT *\s
                    0. Exit Program\s""");
            String userChoice = input.next();
            if (userChoice.contentEquals("1")) {
                printRoster();
            } else if (userChoice.contentEquals("2")) {
                printStudent();
            } else if (userChoice.contentEquals("0")) {
                menuOpen = false;
            } else System.out.println("The option you selected is not valid!");
        } while (menuOpen);
    }

    private static void printRoster() throws IOException {
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
/*    private static void studentAVG() throws IOException {
        String delimiter = ",";
        String fileInput = "src/RosterProject/class_roster_project.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            br.readLine(); //Skip header
            String contentLine;
            while ((contentLine = br.readLine()) != null) {
                contentLine = contentLine.replace("\"", ""); //Get rid of quotes
                contentLine = contentLine.replace("'", ""); //Get rid of quotes
                String[] student = contentLine.split(delimiter);

            }
        }
    }*/
    private static void printStudent() throws IOException {
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
/*            System.out.println(rosterList);
            System.out.println(rosterList.get(0));*/
/*            for (List list : rosterList) {
                if (list.contains("23207161")) {
                    System.out.println(list.get(1));
                }
            }*/
            Scanner input = new Scanner(System.in);
            boolean menuOpen = true;
            do {
                System.out.print("Please Enter Student ID: ");
                String studentID = input.next();
                for (List list : rosterList) {
                    if (list.contains(studentID)) {
                        System.out.printf("Name: %s %s | Quiz: %s | Test-1: %s | Mid-Term: %s | Test-3: %s | Final: %s | Presentation: %s | Project: %s%n", list.get(2), list.get(1), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9));
                    }
                }
/*                System.out.println("""
                    Please select a program:
                    1. Print Full Roster Report\s
                    2. Print Individual Student Report * STILL IN DEVELOPMENT *\s
                    0. Exit Program\s""");
                String userChoice = input.next();
                if (userChoice.contentEquals("1")) {
                    printRoster();
                } else if (userChoice.contentEquals("2")) {
                    printStudent();
                } else if (userChoice.contentEquals("0")) {
                    menuOpen = false;
                } else System.out.println("The option you selected is not valid!");*/
            } while (menuOpen);
        }
    }
}