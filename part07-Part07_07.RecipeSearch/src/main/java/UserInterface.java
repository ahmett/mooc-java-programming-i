import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner, ArrayList<Recipe> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        readFile();
        System.out.println();

        commands();
        System.out.println();

        loop:
        while (true) {
            String command = getCommand();
            System.out.println();

            switch (command) {
                case "list":
                    listRecipes();
                    System.out.println();
                    continue;
                case "find name":
                    findByName();
                    System.out.println();
                    continue;
                case "find cooking time":
                    findByCookingTime();
                    System.out.println();
                    continue;
                case "find ingredient":
                    findByIngredients();
                    System.out.println();
                    continue;
                case "stop":
                    break loop;
            }
        }
    }

    private void readFile() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        Scanner file = null;

        try {
            file = new Scanner(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Recipe recipe = new Recipe();
        ArrayList<String> ingredients = new ArrayList<>();
        int position = 0;

        while (file != null && file.hasNextLine()) {
            String line = file.nextLine();

            if (line.isEmpty() || !file.hasNextLine()) {
                recipe.setIngredients(ingredients);
                recipes.add(recipe);

                recipe = new Recipe();
                ingredients = new ArrayList<>();
                position = 0;

                continue;
            }

            if (position == 0) {
                recipe.setName(line);
            } else if (position == 1) {
                recipe.setCookingTime(Integer.parseInt(line));
            } else {
                ingredients.add(line);
            }

            position++;
        }
    }

    private static void commands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    private String getCommand() {
        System.out.print("Enter command: ");

        return scanner.nextLine();
    }

    private void listRecipes() {
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    private void findByName() {
        System.out.print("Searched word: ");
        String word = scanner.nextLine();

        System.out.println();
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }

    private void findByCookingTime() {
        System.out.print("Max cooking time: ");
        int cookingTime = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }

    private void findByIngredients() {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();

        System.out.println();
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
