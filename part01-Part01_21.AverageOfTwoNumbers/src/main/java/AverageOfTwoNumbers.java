
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        Integer firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        Integer secondNumber = Integer.valueOf(scanner.nextLine());
        
        Double average = ((double)firstNumber + secondNumber) / 2;
        System.out.println("The average is " + average);
    }
}
