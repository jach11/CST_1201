package RosterProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
                    4. Print Grade Count\s
                    5. Print Class Average\s
                    6. Print Roster Map\s
                    0. Exit Program\s""");
            String userChoice = input.next();
            if (userChoice.contentEquals("1")) {
                printRosterReport();
            } else if (userChoice.contentEquals("2")) {
                printRosterGrade();
            } else if (userChoice.contentEquals("3")) {
                printStudentReport();
            } else if (userChoice.contentEquals("4")) {
                printGradeCount();
            } else if (userChoice.contentEquals("5")) {
                printClassAVG();
            } else if (userChoice.contentEquals("6")) {
                printRosterMap();
            } else if (userChoice.contentEquals("0")) {
                menuOpen = false;
            } else System.out.println("The option you selected is not valid!");
        } while (menuOpen);
    }

    public static void printRosterReport() throws IOException {
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

    public static void printRosterGrade() throws IOException {
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
                double finalGrade = (quizWeight * convertedQuiz) + (test1Weight * convertedTest1) + (midtermWeight * convertedMidterm) + (test3Weight * convertedTest3) + (finalexamWeight * convertedFinalexam) + (presentationWeight * convertedPresentation) + (projectWeight * convertedProject);
                System.out.printf("ID: " + student[0] + " Grade: %.2f%n", +finalGrade);
            }
        }
    }

    public static void printStudentReport() throws IOException {
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
                for (List<String> list : rosterList) {
                    if (list.contains(studentID)) {
                        System.out.printf("ID: %s | Name: %s %s | Quiz: %s | Test-1: %s | Mid-Term: %s | Test-3: %s | Final: %s | Presentation: %s | Project: %s%n", list.get(0), list.get(2), list.get(1), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9));
                        menuOpen = false;
                    }
                }
            } while (menuOpen);
        }
    }

    public static void printGradeCount() throws IOException {
        String delimiter = ",";
        String fileInput = "src/RosterProject/class_roster_project.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            br.readLine(); //Skip header
            String contentLine;
            String letterGrade;
            String[] student;
            ArrayList<String> gradeList = new ArrayList<>();
            List<List<String>> rosterList = new ArrayList<>();
            while ((contentLine = br.readLine()) != null) {
                contentLine = contentLine.replace("\"", ""); //Get rid of quotes
                contentLine = contentLine.replace("'", ""); //Get rid of quotes
                student = contentLine.split(delimiter);
                rosterList.add(Arrays.asList(student));
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
                double percentGrade = (quizWeight * convertedQuiz) + (test1Weight * convertedTest1) + (midtermWeight * convertedMidterm) + (test3Weight * convertedTest3) + (finalexamWeight * convertedFinalexam) + (presentationWeight * convertedPresentation) + (projectWeight * convertedProject);
                if (percentGrade >= 90.0 && percentGrade <= 100.0) {
                    letterGrade = "A";
                } else if (percentGrade >= 80.0 && percentGrade < 90.0) {
                    letterGrade = "B";
                } else if (percentGrade >= 70.0 && percentGrade < 80.0) {
                    letterGrade = "C";
                } else if (percentGrade >= 60.0 && percentGrade < 70.0) {
                    letterGrade = "D";
                } else
                    letterGrade = "F";
                gradeList.add(letterGrade);
            }
            int aCount = Collections.frequency(gradeList, "A");
            int bCount = Collections.frequency(gradeList, "B");
            int cCount = Collections.frequency(gradeList, "C");
            int dCount = Collections.frequency(gradeList, "D");
            int fCount = Collections.frequency(gradeList, "F");
            System.out.println("Grade Count:");
            System.out.println("A: " + aCount);
            System.out.println("B: " + bCount);
            System.out.println("C: " + cCount);
            System.out.println("D: " + dCount);
            System.out.println("F: " + fCount);
        }
    }

    public static void printClassAVG() throws IOException {
        String delimiter = ",";
        String fileInput = "src/RosterProject/class_roster_project.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            br.readLine(); //Skip header
            String contentLine;
            ArrayList<Double> gradeList = new ArrayList<>();
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
                double finalGrade = (quizWeight * convertedQuiz) + (test1Weight * convertedTest1) + (midtermWeight * convertedMidterm) + (test3Weight * convertedTest3) + (finalexamWeight * convertedFinalexam) + (presentationWeight * convertedPresentation) + (projectWeight * convertedProject);
                gradeList.add(finalGrade);
            }
            double total = 0;
            for (double i : gradeList) {
                total += i;
            }
            double classAVG = total / gradeList.size();
            System.out.printf("Class Average: %.2f%n", +classAVG);
        }
    }

    public static void printRosterMap() throws IOException {
        String delimiter = ",";
        String fileInput = "src/RosterProject/class_roster_project.csv";
        Map<Integer, String> rosterMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            br.readLine(); //Skip header
            String contentLine;
            while ((contentLine = br.readLine()) != null) {
                contentLine = contentLine.replace("\"", ""); //Get rid of quotes
                contentLine = contentLine.replace("'", ""); //Get rid of quotes
                String[] student = contentLine.split(delimiter);
                for (int i = 0; i < student.length; i++) {
                    rosterMap.put(i, student[i]);
                }
                System.out.println(rosterMap);
            }
        }
    }
}