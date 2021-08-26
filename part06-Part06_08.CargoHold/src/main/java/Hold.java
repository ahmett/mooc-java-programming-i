import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> holds;

    private int maxWeight;

    public Hold(int maxWeight) {
        this.holds = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.holds.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase suitcase : holds) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public String toString() {
        int totalSize = 0;

        for (Suitcase suitcase : holds) {
            totalSize += suitcase.totalWeight();
        }

        return holds.size() + (holds.size() == 1 ? " suitcase " : " suitcases ") + "(" + totalSize + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : holds) {
            suitcase.printItems();
        }
    }
}
