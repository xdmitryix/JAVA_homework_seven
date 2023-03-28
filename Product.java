import java.util.Set;

public class Product {
    private String name;
    private double price;
    private int counter;

    public Product(String name, double price, int counter){
        this.name = name;
        this.price = price;
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean sellCounter() {
        this.counter--;
        return counter>0;
    }

    @Override
    public String toString() {
        return String.format("%s : %.2f : %d", name, price, counter);
    }
}
