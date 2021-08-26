
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        Integer value = Integer.valueOf(scan.nextLine());

        if (value >= 5000 && value < 25_000) {

            Integer baseTax = 100;
            Double exceedingTax = (value - 5000) * 0.08;

            System.out.println("Tax: " + (baseTax + exceedingTax));

        } else if (value >= 25_000 && value < 55_000) {

            Integer baseTax = 1700;
            Double exceedingTax = (value - 25_000) * 0.10;

            System.out.println("Tax: " + (baseTax + exceedingTax));

        } else if (value >= 55_000 && value < 200_000) {

            Integer baseTax = 4700;
            Double exceedingTax = (value - 55_000) * 0.12;

            System.out.println("Tax: " + (baseTax + exceedingTax));

        } else if (value >= 200_000 && value < 1_000_000) {

            Integer baseTax = 22_100;
            Double exceedingTax = (value - 200_000) * 0.15;

            System.out.println("Tax: " + (baseTax + exceedingTax));

        } else if (value >= 1_000_000) {

            Integer baseTax = 142_100;
            Double exceedingTax = (value - 1_000_000) * 0.17;

            System.out.println("Tax: " + (baseTax + exceedingTax));

        } else {
            System.out.println("No tax!");
        }
    }
}
