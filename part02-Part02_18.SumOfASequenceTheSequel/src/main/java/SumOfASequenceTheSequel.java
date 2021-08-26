
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer total = 0;
        
        System.out.println("First number?");
        Integer firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        Integer lastNumber = Integer.valueOf(scanner.nextLine());

        for (int i = firstNumber; i <= lastNumber; i++) {
            total += i;
        }

        System.out.println("The sum is " + total);
    }
}
