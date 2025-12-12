public class SumOfTwo{

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        SumThread thread1 = new SumThread(array, 0, array.length / 2);
        SumThread thread2 = new SumThread(array, array.length / 2, array.length);
        
        thread1.start();
        thread2.start();
    
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long totalSum = thread1.getSum() + thread2.getSum();
        System.out.println("Общая сумма: " + totalSum);
    }
}

class SumThread extends Thread {
    private int[] array;
    private int start;
    private int end;
    private long sum;
    
    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }
    
    public long getSum() {
        return sum;
    }
}