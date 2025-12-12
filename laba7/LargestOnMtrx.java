public class LargestOfMtrx {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 3},
            {9, 2, 8},
            {4, 7, 6}
        };
        
        MaxThread[] threads = new MaxThread[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            threads[i] = new MaxThread(matrix[i]);
            threads[i].start();
        }
        try {
            for (MaxThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        int globalMax = Integer.MIN_VALUE;
        for (MaxThread thread : threads) {
            if (thread.getMax() > globalMax) {
                globalMax = thread.getMax();
            }
        }
        
        System.out.println("Наибольший элемент: " + globalMax);
    }
}

class MaxThread extends Thread {
    private int[] row;
    private int max;
    
    public MaxThread(int[] row) {
        this.row = row;
        this.max = Integer.MIN_VALUE;
    }
    
    @Override
    public void run() {
        for (int value : row) {
            if (value > max) {
                max = value;
            }
        }
    }
    
    public int getMax() {
        return max;
    }
}