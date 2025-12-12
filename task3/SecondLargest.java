import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String newInp = inp.replace("[", "").replace("]", "").replace(" ", "");
        String[] arrayInp = newInp.split(",");
        int[] num = new int[arrayInp.length];
        
        for (int i = 0; i < arrayInp.length; i++) {
                num[i] = Integer.parseInt(arrayInp[i]);
            }
        System.out.println(secondLargest(num));
        in.close();
    }
    public static int secondLargest(int[] num) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int a : num) {
            if (a > largest) {
                secondLargest = largest;
                largest = a;
            } else if (a > secondLargest && a != largest) {
                secondLargest = a;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            return largest;
        }
        
        return secondLargest;
    }
}
