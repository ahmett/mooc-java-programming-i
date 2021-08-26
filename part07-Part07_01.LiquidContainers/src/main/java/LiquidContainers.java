
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parsedInput = input.split(" ");

            String command = parsedInput[0];
            int amount = Integer.parseInt(parsedInput[1]);

            switch (command) {
                case "add":
                    if (amount > 100 || firstContainer + amount > 100) {
                        firstContainer = 100;
                    } else {
                        firstContainer += Math.abs(amount);
                    }
                    continue;
                case "move":
                    if (amount > 100 || secondContainer + amount > 100) {
                        secondContainer = 100;
                    } else {
                        if (amount > firstContainer) {
                            secondContainer += firstContainer;
                            firstContainer = 0;
                        } else {
                            firstContainer -= amount;
                            secondContainer += amount;
                        }
                    }
                    continue;
                case "remove":
                    if (amount > 100 || secondContainer - amount < 0) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
                    continue;
            }

        }
    }

}
