public class Customer {

    private String name;
    private double height;
    private double money;

    public Customer(String name, double height, double money) {
        this.name = name;
        this.height = height;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }
}
