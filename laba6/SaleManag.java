import java.util.*;

public class SaleManag{
    private LinkedList<Product> sales;
    
    public SaleManag() {
        sales = new LinkedList<>();
    }
    
    public void addSale(Product product) {
        sales.add(product);
    }
    
    public void printSales() {
        System.out.println("Список проданных товаров:");
        for (Product product : sales) {
            System.out.println(product);
        }
    }
    
    public double getTotalSales() {
        double total = 0;
        for (Product product : sales) {
            total += product.getPrice();
        }
        return total;
    }
    
    public String getMostPopularProduct() {
        if (sales.isEmpty()) return null;
        
        Map<String, Integer> countMap = new HashMap<>();
        for (Product product : sales) {
            String name = product.getName();
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }
        
        return countMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
