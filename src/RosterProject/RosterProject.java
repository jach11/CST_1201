package RosterProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RosterProject {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String fileInput = "src/RosterProject/class_roster_project.csv";
        List<List<String>> rosterList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            //Get rid of 1st line
            String headerLine = br.readLine();
            String contentLine;
            while ((contentLine = br.readLine()) != null) {
                //Get rid of quotes
                contentLine = contentLine.replace("\"", "");
                contentLine = contentLine.replace("'", "");
                String[] student = contentLine.split(COMMA_DELIMITER);
                System.out.printf("[ID: %s | Name: %s %s | Quiz: %s | Test-1: %s | Mid-Term: %s | Test-3: %s | Final: %s | Presentation: %s | Project: %s]%n", student[0], student[2], student[1], student[3], student[4], student[5], student[6], student[7], student[8], student[9]);
                rosterList.add(Arrays.asList(student));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
/*        for (List<String> strings : rosterList) {
            System.out.println(strings);
        }*/
    }
}