public abstract class Ride {

    private double minHeight;
    private double price;

    public Ride(double minHeight, double price) {
        this.minHeight = minHeight;
        this.price = price;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public double getPrice() {
        return price;
    }
}
