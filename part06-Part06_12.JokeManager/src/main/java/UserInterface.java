import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;

    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        loop:
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String newJoke = scanner.nextLine();

                    jokeManager.addJoke(newJoke);
                    continue;
                case "2":
                    System.out.println(jokeManager.drawJoke());
                    continue;
                case "3":
                    jokeManager.printJokes();
                    continue;
                case "X":
                    break loop;
            }
        }
    }
}
