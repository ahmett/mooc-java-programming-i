import java.text.MessageFormat;

public class Bird {

    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }

    public String getName() {
        return name;
    }

    public void incrementObservationCount() {
        observationCount++;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} ({1}): {2} observations", name, latinName, observationCount);
    }
}
