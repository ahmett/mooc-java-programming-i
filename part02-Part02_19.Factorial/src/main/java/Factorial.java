
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        Integer number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Factorial: " + factorial(number));
    }
    
    public static int factorial(int number) {
        int temp = number, result = 1;
        
        while (temp > 0) {
            result *= temp;
            
            temp--;
        }
        
        return result;
    }
    
}
