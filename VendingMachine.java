import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private List <Product> products = new ArrayList<>();
    private double moneyInMachine = 0; 

    public VendingMachine addProduct(Product product){
        products.add(product);
        return this;
    }


    public Product searchProduct(String name){
        for (Product item: products) {
            if (item.getName().equals(name)){
                return item;
            } 
        }
        return null; 
        }


    public Product sell(String name) throws Exception {
        Product target = searchProduct(name);
        try {
            if (!target.sellCounter()){
                products.remove(target);

            }
            this.moneyInMachine += target.getPrice();
        } catch (NullPointerException e) {
//            System.out.println("Товар не найден");
            throw new Exception("Товар не найден", e);
        }

        return target;
    }
       



    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            res.append(products.get(i))
                    .append("\n");
        }
        res.append(String.format("В автомате сейчас %.2f рублей", moneyInMachine));
        return res.toString();
    }

}
