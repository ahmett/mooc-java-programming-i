
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        StringBuilder text = new StringBuilder("The collection " + this.name + " has " + this.elements.size() + (this.elements.size() == 1 ? " element" : " elements") + ":\n");

        for (String element : this.elements) {
            text.append(element);

            if (this.elements.size() > 1) {
                text.append("\n");
            }
        }

        return text.toString();
    }
}
