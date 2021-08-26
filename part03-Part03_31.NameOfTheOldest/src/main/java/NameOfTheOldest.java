
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String name = "";

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");

            int age = Integer.valueOf(pieces[1]);

            if (age > oldestAge) {
                oldestAge = age;
                name = pieces[0];
            }
        }

        System.out.println("Name of the oldest: " + name);
    }
}
