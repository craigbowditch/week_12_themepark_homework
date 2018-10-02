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

    public boolean isTallEnough(Customer customer) {
        if (customer.getHeight() >= this.minHeight) {
            return true;
        }
        return false;
    }

    public void canPay(Customer customer) {
        if (customer.getMoney() >= this.price){
            customer.pay(this.price);
        }
    }
}