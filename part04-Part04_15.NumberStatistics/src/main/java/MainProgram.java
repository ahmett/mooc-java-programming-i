
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics totalNumberStatistics = new Statistics();
        Statistics evenNumberStatistics = new Statistics();
        Statistics oddNumberStatistics = new Statistics();
        
        System.out.println("Enter numbers:");
        while (true) {
            Integer number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            if (number % 2 == 0) {
                evenNumberStatistics.addNumber(number);
            } else {
                oddNumberStatistics.addNumber(number);
            }
            
            totalNumberStatistics.addNumber(number);
        }
        
        System.out.println("Sum: " + totalNumberStatistics.sum());
        System.out.println("Sum of even numbers: " + evenNumberStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddNumberStatistics.sum());
    }
}
