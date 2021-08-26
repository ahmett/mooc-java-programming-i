
public class AdvancedAstrology {

    public static void printStars(int number) {
        while (number-- > 0) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void printSpaces(int number) {
        while (number-- > 0) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            
            i++;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;

        while (i <= height) {
            printSpaces(height - i);
            printStars(2 * i - 1);

            i++;
        }

        i = 2;
        while (--i >= 0) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
