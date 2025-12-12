import java.util.concurrent.atomic.AtomicInteger;
public class Loader extends Thread {
    private Warehouse sourceWarehouse;
    private Warehouse destinationWarehouse;
    private static final int MAX_WEIGHT_PER_TRIP = 150;
    private static AtomicInteger tripCounter = new AtomicInteger(1);
    private String loaderName;

    public Loader(String name, Warehouse source, Warehouse destination) {
        this.loaderName = name;
        this.sourceWarehouse = source;
        this.destinationWarehouse = destination;
    }

    @Override
    public void run() {
        try {
            while (!sourceWarehouse.isEmpty()) {
                int currentWeight = 0;
                StringBuilder tripProducts = new StringBuilder();

                while (currentWeight < MAX_WEIGHT_PER_TRIP && !sourceWarehouse.isEmpty()) {
                    Product product = sourceWarehouse.takeProduct();
                
                    if (currentWeight + product.getWeight() <= MAX_WEIGHT_PER_TRIP) {
                        currentWeight += product.getWeight();
                        tripProducts.append(product).append(", ");
                        Thread.sleep(100);
                    } else {
                
                        sourceWarehouse.addProduct(product);
                        break;
                    }
                }

                if (currentWeight > 0) {
                    int tripNumber = tripCounter.getAndIncrement();
                    System.out.println(loaderName + " собрал " + currentWeight + 
                                     "кг для поездки №" + tripNumber + 
                                     ": " + tripProducts.toString());

                    System.out.println(loaderName + " отправляется на " + 
                                     destinationWarehouse.getName() + 
                                     " с " + currentWeight + "кг");
                    Thread.sleep(500); 
    
                    System.out.println(loaderName + " разгружает товары на " + 
                                     destinationWarehouse.getName());
                    Thread.sleep(300);
                    System.out.println(loaderName + " завершил поездку №" + tripNumber + 
                                     " и возвращается обратно");
                    Thread.sleep(200); 
                }
            }
            
            System.out.println(loaderName + " завершил работу - склад пуст");
            
        } catch (InterruptedException e) {
            System.out.println(loaderName + " был прерван");
        }
    }
}

