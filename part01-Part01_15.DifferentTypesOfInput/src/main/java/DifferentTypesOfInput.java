
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = scan.nextLine();
        
        System.out.println("Give an integer:");
        Integer number = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        Double doubleValue = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        Boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
