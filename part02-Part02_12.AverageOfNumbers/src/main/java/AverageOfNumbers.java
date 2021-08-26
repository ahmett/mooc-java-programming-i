
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer count = 0, sum = 0;

        while (true) {
            System.out.println("Give a number:");
            Integer number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            count++;
            sum += number;
        }

        System.out.println("Average of the numbers: " + (1.0 * sum / count));
    }
}
