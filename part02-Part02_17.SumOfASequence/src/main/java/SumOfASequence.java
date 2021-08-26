
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        Integer total = 0;
        Integer lastNumber = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i <= lastNumber; i++) {
            total += i;
        }
        
        System.out.println("The sum is " + total);
    }
}
