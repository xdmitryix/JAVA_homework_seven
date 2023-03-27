public class DrinksGas extends Drinks {

    public DrinksGas(String name, double price, int counter) {
        super(name, price, counter);
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Газированный : ")
                .append(super.toString());
        return build.toString();
    }
    
}