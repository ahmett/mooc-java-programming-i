
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer firstNumber = Integer.valueOf(scanner.nextLine());
        Integer secondNumber = Integer.valueOf(scanner.nextLine());
        
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber + ".");
        } else if (secondNumber > firstNumber) {
            System.out.println(firstNumber + " is smaller than " + secondNumber + ".");
        } else {
            System.out.println(firstNumber +  " is equal to " + secondNumber + ".");
        }
    }
}
