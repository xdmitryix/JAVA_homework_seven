
public class Main {

    public static void main(String[] args) {
        Milk milk1 = new Milk("Домик в деревне", 200, 3);
        System.out.println(milk1.toString());
        Chocolate choko1 = new Chocolate("Ritter sport", 200 , 4, "Молочный");
        System.out.println(choko1.toString());
        DrinksGas drinkGas1 = new DrinksGas("Coca-cola", 250, 1);
        System.out.println(drinkGas1.toString());
        DrinksWithOutGas drinkWOG1 = new DrinksWithOutGas("Bon aqua", 80, 10);
        System.out.println(drinkWOG1.toString());
    }
}