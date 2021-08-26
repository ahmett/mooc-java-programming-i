
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer number = Integer.valueOf(scanner.nextLine());
        System.out.println(Math.abs(number));
    }
}
