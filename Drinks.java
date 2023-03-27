public class Drinks extends Product {

    public Drinks(String name, double price, int counter) {
        super(name, price, counter);
    }
    
    @Override
    public String toString() {
        return String.format("Напиток : %s", super.toString());
    }
}
