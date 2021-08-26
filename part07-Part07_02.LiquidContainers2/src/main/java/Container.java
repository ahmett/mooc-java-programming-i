public class Container {

    private int liquidAmount;

    public Container() {
        liquidAmount = 0;
    }

    public int contains() {
        return liquidAmount;
    }

    public void add(int amount) {
        if (amount > 100 || liquidAmount + Math.abs(amount) > 100) {
            liquidAmount = 100;
        } else {
            liquidAmount += Math.abs(amount);
        }
    }

    public void remove(int amount) {
        if (amount > 100 || liquidAmount - amount < 0) {
            liquidAmount = 0;
        } else {
            liquidAmount -= amount;
        }
    }

    @Override
    public String toString() {
        return liquidAmount + "/100";
    }
}
