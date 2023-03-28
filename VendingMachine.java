import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List <Product> products = new ArrayList<>();

    public VendingMachine addProduct(Product productAdd){
        products.add(productAdd);
        return this;
    }
}
