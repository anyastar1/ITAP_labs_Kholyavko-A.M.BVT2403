import java.util.Scanner;

public class FilterEven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String cleanedInput = input.replace("[", "").replace("]", "").replace(" ", "");
        String[] stringArray = cleanedInput.split(",");
            
        int[] numbers = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            numbers[i] = Integer.parseInt(stringArray[i]);
        }
        int[] evenNumbers = filterEven(numbers);

        System.out.println(arrayToString(evenNumbers));
        
        scanner.close();
    }
    public static int[] filterEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }
        
        return result;
    }
    
    public static String arrayToString(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}