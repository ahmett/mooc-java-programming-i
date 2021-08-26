
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try {
            scanner = new Scanner(Paths.get(file));
            
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                
                String name = data[0];
                String age = data[1].equals("1") ? "1 year" : data[1] + " years";
                
                System.out.println(name + ", age: " + age);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
