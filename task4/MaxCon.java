pimport java.util.Scanner;

public class MaxCon {
    public static int maxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        
        return maxCount;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String arrayPart = input.replace("[", "").replace("]", "").trim();
        String[] numbers = arrayPart.split(",");
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i].trim());
        }
        
        System.out.println(maxConsecutiveOnes(arr));
    }
}

