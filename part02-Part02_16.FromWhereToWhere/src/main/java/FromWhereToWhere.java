
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        Integer whereTo = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        Integer whereFrom = Integer.valueOf(scanner.nextLine());
        
        for (int i = whereFrom; i <= whereTo; i++) {
            if (whereTo >= whereFrom) {
                System.out.println(i);
            }
        }
    }
}
