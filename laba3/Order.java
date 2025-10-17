
public class Order {
    private String orderNumber;
    private String products;
    private String deliveryAddress;
    private double totalCost;
    
    public Order(String orderNumber, String products, String deliveryAddress, double totalCost) {
        this.orderNumber = orderNumber;
        this.products = products;
        this.deliveryAddress = deliveryAddress;
        this.totalCost = totalCost;
    }
    
    public String getOrderNumber() {
        return orderNumber;
    }
    
    public String getProducts() {
        return products;
    }
    
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    
    public double getTotalCost() {
        return totalCost;
    }
    
    public void setProducts(String products) {
        this.products = products;
    }
    
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
    @Override
    public String toString() {
        return "  Заказ: " +
                " номер заказа " + orderNumber  +
                ", товары " + products +
                ", адрес " + deliveryAddress +
                ", стоимость " + totalCost;
    }
}