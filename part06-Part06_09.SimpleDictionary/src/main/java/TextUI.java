import java.util.Scanner;

public class TextUI {
    private Scanner scanner ;

    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        loop: while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.print("Word: ");
                    String word = scanner.nextLine();

                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();

                    dictionary.add(word, translation);
                    continue;
                case "search":
                    System.out.print("To be translated: ");
                    String translated = scanner.nextLine();

                    String result = dictionary.translate(translated);

                    if (result == null) {
                        System.out.println("Word " + translated + " was not found");
                        continue;
                    }

                    System.out.println("Translation: " + result);
                    continue;
                case "end":
                    System.out.println("Bye bye!");
                    break loop;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
