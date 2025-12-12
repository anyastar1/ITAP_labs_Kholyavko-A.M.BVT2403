import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Warehouse {
    private BlockingQueue<Product> products;
    private String name;

    public Warehouse(String name) {
        this.name = name;
        this.products = new LinkedBlockingQueue<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public synchronized Product takeProduct() throws InterruptedException {
        return products.take();
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public String getName() {
        return name;
    }
    
    public int getProductCount() {
        return products.size();
    }
}
