public class Main {
    public static void main(String[] args) {
        Managing managing = new Managing();
        
        Order order1 = new Order("ORD001", "Ноутбук", "ул. Ленина, 1", 50000.0);
        Order order2 = new Order("ORD002", "Телефон", "ул. Пушкина, 2", 30000.0);
     
        managing.addOrder("ORD001", order1);
        managing.addOrder("ORD002", order2);
        managing.addOrder("ORD001", order1);
        
        System.out.println(managing.getOrder("ORD001"));
        System.out.println(managing.getOrder("ORD003"));
        
        managing.showAll();
        managing.removeOrder("ORD002");

        System.out.println("ORD001 существует: " + (managing.getOrder("ORD001") != null));
        System.out.println("ORD002 существует: " + (managing.getOrder("ORD002") != null));
        
        managing.showAll();
    }
}