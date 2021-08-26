
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        Integer firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        Integer secondNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        Integer thirdNumber = Integer.valueOf(scanner.nextLine());
        
        Double average = ((double)firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("The average is " + average);
    }
}
