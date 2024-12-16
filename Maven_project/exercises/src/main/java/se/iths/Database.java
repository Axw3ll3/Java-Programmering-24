package se.iths;
import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, Product> products = new HashMap<>();

    public void saveProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product findById(String id) {
        return products.get(id);
    }

    public void updateStock(String id, int newQuantity) {
        Product product = products.get(id);
        if (product != null) {
            product.setStockQuantity(newQuantity);
            products.put(id, product);
        }
    }

    // This is not dangerous... not dangerous at all... :')
    public void clearDatabase() {
        products.clear();
    }
}