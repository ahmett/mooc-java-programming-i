import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start() {
        loop:
        while (true) {
            String command = getCommand();
            System.out.println();

            switch (command) {
                case "Add":
                    add();
                    continue loop;
                case "Observation":
                    observation();
                    continue loop;
                case "All":
                    all();
                    continue loop;
                case "One":
                    System.out.println(one());
                    continue loop;
                case "Quit":
                    break loop;
            }
        }
    }

    private String getCommand() {
        System.out.print("? ");

        return scanner.nextLine();
    }

    private void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();

        birds.add(new Bird(name, latinName));
    }

    private void observation() {
        Bird bird = one();

        if (bird != null) {
            bird.incrementObservationCount();
        } else {
            System.out.println("Not a bird!");
        }
    }

    private void all() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    private Bird one() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();

        for (Bird bird : birds) {
            if (bird.getName().equals(birdName)) {
                return bird;
            }
        }

        return null;
    }
}
