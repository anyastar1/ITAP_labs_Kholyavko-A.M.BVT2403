public class WarehouseManagement {
    public static void main(String[] args) {
        Warehouse sourceWarehouse = new Warehouse("Склад А");
        Warehouse destinationWarehouse = new Warehouse("Склад Б");

        int totalProducts = 20;
        for (int i = 1; i <= totalProducts; i++) {
            int weight = (int) (Math.random() * 50) + 10; 
            sourceWarehouse.addProduct(new Product(i, weight));
        }

        System.out.println("Склад А заполнен " + totalProducts + " товарами");

        Loader loader1 = new Loader("Грузчик 1", sourceWarehouse, destinationWarehouse);
        Loader loader2 = new Loader("Грузчик 2", sourceWarehouse, destinationWarehouse);
        Loader loader3 = new Loader("Грузчик 3", sourceWarehouse, destinationWarehouse);

        loader1.start();
        loader2.start();
        loader3.start();

        try {
            loader1.join();
            loader2.join();
            loader3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все товары успешно перенесены на Склад Б!");
    }
}