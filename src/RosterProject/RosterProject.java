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
        List<List<String>> roster = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                roster.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(roster);
    }
}
