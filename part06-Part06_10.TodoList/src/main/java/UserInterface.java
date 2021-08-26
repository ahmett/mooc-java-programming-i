import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;

    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        loop: while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.print("To add: ");
                    String toAdd = scanner.nextLine();

                    todoList.add(toAdd);
                    continue;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int toRemove = Integer.parseInt(scanner.nextLine());

                    todoList.remove(toRemove);
                    continue;
                case "list":
                    todoList.print();
                    continue;
                case "stop":
                    break loop;
            }
        }
    }
}
