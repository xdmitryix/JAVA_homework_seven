public class DrinksWithOutGas extends Drinks{

    public DrinksWithOutGas(String name, double price, int counter) {
        super(name, price, counter);
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Негазированный : ")
                .append(super.toString());
        return (build.toString());
    }   
}
