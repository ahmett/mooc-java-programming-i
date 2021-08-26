
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer oneDayInSeconds = 86400;
        System.out.println("How many days would you like to convert to seconds?");
        Integer dayMultiplier = Integer.valueOf(scanner.nextLine());
        System.out.println(dayMultiplier * oneDayInSeconds);
    }
}
