import java.util.Scanner;

public class Main {
    public static int pairDifference(int[] arr, int k) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
  
        String[] parts = input.split("],");
        String arrayPart = parts[0].replace("[", "").trim();
        int k = Integer.parseInt(parts[1].trim());
        
        String[] numbers = arrayPart.split(",");
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i].trim());
        }
        
        System.out.println(pairDifference(arr, k));
    }
}

