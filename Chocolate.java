public class Chocolate extends Product {
    private String taste;

    public Chocolate(String name, double price, int counter, String taste) {
        super(name, price, counter);
        this.taste = taste;
    }
    
    @Override
    public String toString() {
        return String.format("Шоколад cо вкусом %s, %S", taste, super.toString());
    }
}
