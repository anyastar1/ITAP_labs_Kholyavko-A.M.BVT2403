public class Managing {
    private java.util.HashMap<String, Order> orders = new java.util.HashMap<>();

    public void addOrder(String number, Order order) {
        orders.put(number, order);
    }

    public Order getOrder(String number) {
        return orders.get(number);
    }

    public void removeOrder(String number) {
        orders.remove(number);
    }

    public void showAll() {
        for (Order order : orders.values()) {
            System.out.println(order);
        }
    }

    public int count() {
        return orders.size();
    }
}