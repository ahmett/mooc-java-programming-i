
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personCount = 0;
        String longestName = "";
        double totalBirthYears = 0.0;

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");

            String name = pieces[0];
            int birthYear = Integer.valueOf(pieces[1]);
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
            totalBirthYears += birthYear;
            
            personCount++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (totalBirthYears / personCount));
    }
}
