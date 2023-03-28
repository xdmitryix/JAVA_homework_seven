
public class Main {

    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("Блинчики", 229, 4))
                .addProduct(new Milk("Домик в деревне", 89, 3))
                .addProduct(new Chocolate("Ritter sport", 180, 6, "С орехом"))
                .addProduct(new Drinks("Coca Cola", 120, 2))
                .addProduct(new DrinksGas("Aqua minerale", 80,3))
                .addProduct(new DrinksWithOutGas("Aqua minerale", 89, 4));
        System.out.println(mart);

    }
}