import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("Блинчики", 229, 4))
                .addProduct(new Milk("Домик в деревне", 89, 3))
                .addProduct(new Chocolate("Ritter sport", 180, 6, "С орехом"))
                .addProduct(new Drinks("Coca Cola", 120, 2))
                .addProduct(new DrinksGas("Aqua minerale sas", 80,3))
                .addProduct(new DrinksWithOutGas("Aqua minerale no gas", 89, 4));
        System.out.println("До продажи: ");        
        System.out.println(mart.toString());
        System.out.println();
        System.out.println("Покупаем:"); 
        PrintSell(mart, "Coca Cola");
        System.out.println(); 
        System.out.println("после продажи: ");
        System.out.println(mart.toString());
        System.out.println();
        System.out.println("Покупаем:"); 
        PrintSell(mart, "Coca Cola");
        System.out.println(); 
        System.out.println("после продажи: ");
        System.out.println(mart.toString());
        System.out.println(); 
        System.out.println("Покупаем:"); 
        PrintSell(mart, "Coca Cola");
        System.out.println(); 
        System.out.println("после продажи: ");
        System.out.println(mart.toString());
        System.out.println(); 
        System.out.println("Покупаем:"); 
        PrintSell(mart, "Aqua minerale no gas");
        System.out.println(); 
        System.out.println("после продажи: ");
        System.out.println(mart.toString());     

        

    }

    public static void PrintSell (VendingMachine machine, String nameProd){
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}