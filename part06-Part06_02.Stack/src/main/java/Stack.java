import java.util.ArrayList;

public class Stack {

    private ArrayList<String> entries;

    public Stack() {
        this.entries = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.entries.isEmpty();
    }

    public void add(String value) {
        this.entries.add(value);
    }

    public ArrayList<String> values() {
        return this.entries;
    }

    public String take() {
        String value = this.entries.get(this.entries.size() - 1);
        this.entries.remove(this.entries.size() - 1);
        
        return value;
    }

}
