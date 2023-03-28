import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List <Product> products = new ArrayList<>();

    public VendingMachine addProduct(Product product){
        products.add(product);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            res.append(products.get(i))
                    .append("\n");
        }
        return res.toString();
    }
}
