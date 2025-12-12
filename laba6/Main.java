public class Main {
    public static void main(String[] args) {
        SaleManag manager = new SaleManag();
        
        manager.addSale(new Product("Яблоки", 50.0));
        manager.addSale(new Product("Хлеб", 30.0));
        manager.addSale(new Product("Яблоки", 50.0));
        manager.addSale(new Product("Молоко", 80.0));
        
        manager.printSales();
        System.out.println("Общая сумма: " + manager.getTotalSales() + " руб.");
        System.out.println("Самый популярный: " + manager.getMostPopularProduct());
    }
}