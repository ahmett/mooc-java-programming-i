
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parsedInput = input.split(" ");

            String command = parsedInput[0];
            int amount = Integer.parseInt(parsedInput[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            } else if (command.equals("move")) {
                if (amount > 100 || secondContainer.contains() + amount > 100) {
                    secondContainer.add(100 - secondContainer.contains());
                } else {
                    if (amount > firstContainer.contains()) {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(firstContainer.contains());
                    } else {
                        firstContainer.remove(amount);
                        secondContainer.add(amount);
                    }
                }
            }
        }
    }

}
